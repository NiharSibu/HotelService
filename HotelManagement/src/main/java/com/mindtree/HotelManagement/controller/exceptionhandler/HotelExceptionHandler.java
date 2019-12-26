package com.mindtree.HotelManagement.controller.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mindtree.HotelManagement.controller.HotelManagementController;
import com.mindtree.HotelManagement.exception.hotelserviceexception.DuplicateEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongEmailException;
import com.mindtree.HotelManagement.exception.hotelserviceexception.WrongPasswordException;

@ControllerAdvice(assignableTypes = {HotelManagementController.class})
public class HotelExceptionHandler {
	
	@ExceptionHandler(WrongEmailException.class)
	public String wrongEmailExceptionHandler (WrongEmailException e, Model model) {
		model.addAttribute("exception", e.getMessage());
		return "error";
	}
	@ExceptionHandler(WrongPasswordException.class)
	public String wrongPasswordExceptionHandler (WrongPasswordException e, Model model) {
		model.addAttribute("exception", e.getMessage());
		return "error";
	}
	@ExceptionHandler(DuplicateEmailException.class)
	public String dupixateEmailExceptionHandler (DuplicateEmailException e, Model model) {
		model.addAttribute("exception", e.getMessage());
		return "error";
	}

}
