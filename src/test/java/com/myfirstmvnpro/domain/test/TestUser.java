package com.myfirstmvnpro.domain.test;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myfirstmvnpro.domain.User;
import com.myfirstmvnpro.domain.UserWithCons;
import com.myfirstmvnpro.domain.UserWithInner;
import com.myfirstmvnpro.service.UserService;

public class TestUser {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User) ac.getBean("user");
//		System.out.println(user);
		
		User user = new User();
		user.setId(1);
		
		UserService us =(UserService) ac.getBean("userService");
		//user = us.getUserDao().get(user.getId());
		
		System.out.println(us);
	}
	
	
	public static void test1(ApplicationContext ac){
		//通过别名获取，别名可以有多个
				//User user =(User) ac.getBean("myuser2");
				//User user =(User) ac.getBean("myuser");
				//通过id获取，唯一
				User user1 =(User) ac.getBean("user");
				User user2 =(User) ac.getBean("user");
				//通过类类型获取，要求对象是单例的
				//User user =(User) ac.getBean(User.class);
				System.out.println(user1==user2);//true==>单例
				System.out.println(user1);
				
				//内部类测试
				UserWithInner.Location lo = (UserWithInner.Location)ac.getBean("innerLocation");
				System.out.println(lo);
				
				//工厂方法测试
				UserService us =(UserService) ac.getBean("userService");
				System.out.println(us);
				//构造函数测试
				UserWithCons userWithCons = (UserWithCons) ac.getBean("userWithCons");
				System.out.println(userWithCons);
				UserWithCons userWithCons2 = (UserWithCons) ac.getBean("userWithCons2");
				
				System.out.println(userWithCons2.getUser().getId());
				System.out.println(userWithCons2.getUserList().size());
				Map<Integer,String> map = userWithCons2.getMap();
				
				for(Map.Entry<Integer, String> entry : map.entrySet()){
					System.out.println(entry.getKey()+"="+entry.getValue());
				}
	}

}
