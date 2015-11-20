package com.myfirstmvnpro.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myfirstmvnpro.domain.User;
import com.myfirstmvnpro.service.UserService;

@Controller
public class HomeController {
	 @Resource(name="userService")
	 private UserService userService;
	 
	 @RequestMapping({"/","/home"})
	 public String showUsers(Map<String,List<User>> model){
		List<User> userList = userService.getAllUsers();
		model.put("users", userList);
		return "home";
	 }
}
