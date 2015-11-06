package com.myfirstmvnpro.domain.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myfirstmvnpro.controller.UserController;
import com.myfirstmvnpro.domain.User;

public class TestUserService {
	public static void main(String[] args) {
		TestUserService ts =new TestUserService();
		ts.test();
	}
	
	@Test
	public void test(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserController controller = ac.getBean(UserController.class);  
        User user = controller.getById();
        
        User user2 = new User();
        user2.setId(5);
        user2.setName("cc");
        user2.setUsername("cc");
        user2.setEmail("www.cc.com");
        user2.setPassword("cc");
        
        controller.registe(user2);
        System.out.println(user);
	}
}
