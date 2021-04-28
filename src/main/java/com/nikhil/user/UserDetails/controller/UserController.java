package com.nikhil.user.UserDetails.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nikhil.user.UserDetails.model.User;
import com.nikhil.user.UserDetails.repository.UserDb;

/**
 * UserController class is used for handling user related operations
 * 
 * @author NIKHIL
 * @since 28-04-2021
 *
 */
@Controller
@RequestMapping("/")
public class UserController {

	private UserDb userDb = new UserDb();

	/**
	 * home method method used to redirect the call to users end point
	 * @return {@link String}
	 */
	@GetMapping("/")
	public String home() {
		return "redirect:/users";
	}

	/**
	 * getAllUsers method is used to fetch all user details to display 
	 * @return {@link ModelAndView}
	 */
	@GetMapping("/users")
	public ModelAndView getAllUsers() {
		List<User> usersList = userDb.fetchAll();
		ModelAndView modelAndView = new ModelAndView("users");
		modelAndView.addObject("listUser", usersList);
		return modelAndView;
	}


}
