package com.mindtree.HotelManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.HotelManagement.dto.BookingDetailsDto;
import com.mindtree.HotelManagement.dto.RoomDto;
import com.mindtree.HotelManagement.dto.UserDto;
import com.mindtree.HotelManagement.exception.hotelserviceexception.DuplicateEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongPasswordException;
import com.mindtree.HotelManagement.service.HotelService;

@Controller
public class HotelManagementController {

	@Autowired
	HotelService hotelService;

	@RequestMapping("/My Stay")
	public String index() {
		return "Room";
	}

	@PostMapping("/roomType")
	public String getRoomType(String roomType, Map<String, Object> model) {
		// model.addAttribute("type", roomType);
		System.out.println(roomType);
		List<RoomDto> rooms = hotelService.getRoomByType(roomType);
		for (RoomDto roomDto : rooms) {
			System.out.println(roomDto.getType());
			System.out.println(roomDto.getPrice());
		}
		model.put("rooms", rooms);
		return "hotelRooms";
	}
	@PostMapping("/roomId")
	public String getRoomType(Integer roomId) {
		hotelService.getRoomByType(roomId);
		return "userResistation";
	}
	
	@PostMapping("/user")
	public String getUser(String name,String phoneNo,String email,String password) throws DuplicateEmailException{
		hotelService.checkEmail(email);
		UserDto user=new UserDto(name,email,phoneNo,password);
		hotelService.setUserInDB(user);
		System.out.println(user.getEmail());
		return "userResistation";
	}
	
	@PostMapping("/bookingPage")
	public String checkUser (String email, String password, Model model) throws WrongEmailException, WrongPasswordException {
		boolean check=hotelService.checkEmailPasword(email,password);
		int id= hotelService.getIdbyEmail(email);
		model.addAttribute("id",id);
		return "Booking";
	}
	
	@PostMapping("/booked")
	public String getBookingDetails(Integer userId,String date,String password,Model model) throws WrongPasswordException {
		System.out.println(date);
		boolean check = hotelService.checkPasword(userId,password);
		BookingDetailsDto booking=hotelService.getBooking(userId,date);
		model.addAttribute("bookingDto",booking);
		return "booked";
	}
}
