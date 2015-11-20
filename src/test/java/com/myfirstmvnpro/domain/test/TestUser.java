package com.myfirstmvnpro.domain.test;

import java.lang.reflect.Field;
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

	public static void main(String[] args) throws Exception {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		User user = (User) ac.getBean("user");
//		System.out.println(user);
		
		//User user = new User();
		//user.setId(1);
		
		//UserService us =(UserService) ac.getBean("userService");
		//user = us.getUserDao().get(user.getId());
		
		//System.out.println(us);
//		Integer a = 1000, b = 1000; 
//		System.out.println(a == b);//1
//		Integer c = 100, d = 100; 
//		System.out.println(c == d);//2
		  Class cache = Integer.class.getDeclaredClasses()[0]; //1
	      Field myCache = cache.getDeclaredField("cache"); //2
	      myCache.setAccessible(true);//3
	  
	      Integer[] newCache = (Integer[]) myCache.get(cache); //4
	      System.out.println(newCache[132]);
	      newCache[132] = newCache[133]; //5
	  
	      int a = 2;
	      int b = a + a;
	      System.out.printf("%d + %d = %d", a, a, b); //
	}
	
	
	public static void test1(ApplicationContext ac){
		//ͨ������ȡ����������ж��
				//User user =(User) ac.getBean("myuser2");
				//User user =(User) ac.getBean("myuser");
				//ͨ��id��ȡ��Ψһ
				User user1 =(User) ac.getBean("user");
				User user2 =(User) ac.getBean("user");
				//ͨ�������ͻ�ȡ��Ҫ������ǵ����
				//User user =(User) ac.getBean(User.class);
				System.out.println(user1==user2);//true==>����
				System.out.println(user1);
				
				//�ڲ������
				UserWithInner.Location lo = (UserWithInner.Location)ac.getBean("innerLocation");
				System.out.println(lo);
				
				//������������
				UserService us =(UserService) ac.getBean("userService");
				System.out.println(us);
				//���캯�����
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
