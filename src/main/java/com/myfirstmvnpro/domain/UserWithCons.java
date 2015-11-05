package com.myfirstmvnpro.domain;

import java.util.List;
import java.util.Map;

public class UserWithCons {
	private Integer id;
	private String username;
	private String password;
	private String email;
	
	private List<User> userList;
	
	private Map<Integer,String> map;
	
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	private User user = new User();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user=user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("setId................");
		this.id = id;
	}
	public UserWithCons(){}
	public UserWithCons(User user){
		super();
		this.user=user;
	}
	private UserWithCons(Integer id, String username, String password, String email) {
		super();
		System.out.println("constructor.............");
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public static UserWithCons create(Integer id, String username, String password, String email){
		UserWithCons userWithCons = new UserWithCons(id,username,password,email);
		return userWithCons;
	}
	
	@Override
	public String toString() {
		return "id:"+id+",username:"+username+",password:"+password+",email:"+email;
	}
}
