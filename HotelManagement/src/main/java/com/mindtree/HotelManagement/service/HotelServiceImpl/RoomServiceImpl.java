package com.mindtree.HotelManagement.service.HotelServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.HotelManagement.dto.BookingDetailsDto;
import com.mindtree.HotelManagement.dto.RoomDto;
import com.mindtree.HotelManagement.dto.UserDto;
import com.mindtree.HotelManagement.entity.BookingDetails;
import com.mindtree.HotelManagement.entity.Room;
import com.mindtree.HotelManagement.entity.User;
import com.mindtree.HotelManagement.exception.hotelserviceexception.DuplicateEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongPasswordException;
import com.mindtree.HotelManagement.repository.BookingDetailsRepository;
import com.mindtree.HotelManagement.repository.RoomRepository;
import com.mindtree.HotelManagement.repository.UserRepository;
import com.mindtree.HotelManagement.service.HotelService;


@Service
public class RoomServiceImpl implements HotelService {

	@Autowired
	RoomRepository roomRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	BookingDetailsRepository bookingRepository;
	static ModelMapper model = new ModelMapper();
	static int currentRoomId=0;
	
	@Override
	public List<RoomDto> getRoomByType(String roomType) {
		List<Room> rooms =  roomRepository.findAll();
		List<Room> result=new ArrayList<Room>();
		for (Room room : rooms) {
			if(roomType.equals(room.getType())) {
				result.add(room);
			}
		}
		List<RoomDto> roomsDto = new ArrayList<RoomDto>();
		for (Room room : result) {
			RoomDto roomDto=new RoomDto();
			roomDto=model.map(room, RoomDto.class);
			roomsDto.add(roomDto);
		}
		return roomsDto;
	}

	@Override
	public void getRoomByType(Integer roomId) {
		System.out.println(roomId);
		currentRoomId=roomId;
	}

	@Override
	public void setUserInDB(UserDto userDto) {
		User user = model.map(userDto, User.class);
		userRepository.save(user);
	}
	

	@Override
	public BookingDetailsDto getBooking(int userId,String date) {
		System.out.println(currentRoomId);
		Optional<User> u=userRepository.findById(userId);
		User user=u.get();
		Optional<Room> r=roomRepository.findById(currentRoomId);
		Room room=r.get();
		BookingDetails booking = new BookingDetails();
		booking.setCustomerId(userId);
		booking.setCustomerName(user.getUserName());
		booking.setDate(date);
		booking.setHotelName(room.getHotel().getHotelName());
		booking.setRoomID(room.getRoomId());
		booking.setRoomType(room.getType());
		booking.setRoomPrice(room.getPrice());
		bookingRepository.save(booking);
		
		
		List<BookingDetails> bookings=bookingRepository.findAll();
		BookingDetails book=bookings.get(bookings.size()-1);
		
		BookingDetailsDto bookingDto=new BookingDetailsDto();
		bookingDto.setBookingId(book.getBookingId());
		bookingDto.setCustomerId(userId);
		bookingDto.setCustomerName(user.getUserName());
		bookingDto.setDate(date);
		bookingDto.setHotelName(room.getHotel().getHotelName());
		bookingDto.setRoomID(room.getRoomId());
		bookingDto.setRoomType(room.getType());
		bookingDto.setRoomPrise(room.getPrice());

		return bookingDto;
	}

	@Override
	public boolean checkEmailPasword(String email, String password) throws WrongEmailException, WrongPasswordException {
		boolean check=true;
		 List<User>users = userRepository.findAll();
		 if(users.isEmpty()) {
			 check=false;
			 throw new WrongEmailException("Wrong Email try again   "
						+ "OR   do resister befpre login");	
		 }
		 else {
		 int count = users.size();
		 for (User user : users) {
			if(email.equals(user.getEmail())) {
				if(password.equals(user.getPassword())) {	
					break;
				}
				else {
					throw new WrongPasswordException("Wrong Pasword try again");
				}
			}
			else 
			{
				count-- ;
				if(count == 0) {
					check = false;
					throw new WrongEmailException("Wrong Email try again   "
							+ "OR   do resister befpre login");	
				}
			}
		 }
	  }
		 return check;
	}

	@Override
	public boolean checkEmail(String email) throws DuplicateEmailException{
		boolean check=true;
		List<User>users = userRepository.findAll();
		if(users==null) {
			check=true;
		}
		else {
		for (User user : users) {
			if(email.equals(user.getEmail())) {
				check=false;
				throw new DuplicateEmailException("This Email already exists"
						+ "Try another email");
			}
		}
	 }
		return check;
	}

	@Override
	public boolean checkPasword(Integer userId, String password) throws WrongPasswordException {
		boolean chk = true;
		Optional<User> u = userRepository.findById(userId);
		User user = u.get();
		if(password.equals(user.getPassword())) {
			chk=true;
		}
		else {
			chk=false;
			throw new WrongPasswordException("Wrong Pasword try again");
		}
		return false;
	}

	@Override
	public int getIdbyEmail(String email) {
		List<User>users=userRepository.findAll();
		int id=0;
		for (User user : users) {
			if(email.equals(user.getEmail())) {
				id=user.getUserId();
			}
		}
		return id;
	}
}
