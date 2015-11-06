package com.myfirstmvnpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myfirstmvnpro.domain.User;
import com.myfirstmvnpro.service.UserService;

@Controller
public class UserController {
    @Autowired  
    private UserService userService;  
    
    @RequestMapping(value="/registe", method=RequestMethod.GET)  
    public String registe(User user) {  
        userService.registe(user);  
        return "index";  
    }  
    @RequestMapping(value="/getById", method=RequestMethod.GET)  
    public User getById() {  
        Integer id = 1;
        User user =  userService.getUserById(id); 
        return user;
    }  
}
