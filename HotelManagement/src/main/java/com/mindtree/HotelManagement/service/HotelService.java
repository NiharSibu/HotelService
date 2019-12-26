package com.mindtree.HotelManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.HotelManagement.dto.BookingDetailsDto;
import com.mindtree.HotelManagement.dto.RoomDto;
import com.mindtree.HotelManagement.dto.UserDto;
import com.mindtree.HotelManagement.exception.hotelserviceexception.DuplicateEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongPasswordException;

@Service
public interface HotelService {

	public List<RoomDto> getRoomByType(String roomType);

	public void getRoomByType(Integer roomId);

	public void setUserInDB(UserDto user);

	public BookingDetailsDto getBooking(int userId, String date);

	public boolean checkEmailPasword(String email, String password) throws WrongEmailException, WrongPasswordException;

	public boolean checkEmail(String email) throws DuplicateEmailException;

	public boolean checkPasword(Integer userId, String password)throws WrongPasswordException;

	public int getIdbyEmail(String email);

}
