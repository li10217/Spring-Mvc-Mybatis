package com.game.yxd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.game.yxd.dto.User;
import com.game.yxd.service.IUserService;

@Controller
public class HomeController {

	@Autowired(required = false)
	IUserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping("/userlist")
	public @ResponseBody List<User> getAllUser() {
		return userService.getAllUser();
	}

	@RequestMapping("/userlist/{id}")
	public @ResponseBody User getUser(@PathVariable("id") Integer userId) {
		return userService.getUserById(userId);
	}
}
