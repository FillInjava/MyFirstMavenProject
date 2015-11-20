package com.myfirstmvnpro.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myfirstmvnpro.domain.User;
import com.myfirstmvnpro.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
    @Resource(name="userService")
    private UserService userService;  
    
    /**
     * 注册页面
     * @param model
     * @return
     */
    @RequestMapping(value="/regist", method=RequestMethod.GET)  
    public String regist(Model model) {  
        model.addAttribute("user",new User());  
        return "regist";  
    }  
    /**
     * 注册
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value="/regist", method=RequestMethod.POST)  
    public String regist(Model model,@ModelAttribute("user")User user) { 
    	userService.save(user);
    	return "redirect:/";
    }  
    @RequestMapping(value="/{id}", method=RequestMethod.GET)  
    public String getById(@PathVariable String id,Model model) {  
    	User user =  userService.getUserById(Integer.parseInt(id));
    	model.addAttribute(user);
        
    	return "details";
    }
   
}
