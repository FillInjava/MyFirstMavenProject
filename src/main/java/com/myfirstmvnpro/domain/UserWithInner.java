package com.myfirstmvnpro.domain;

public class UserWithInner {
	private int id;
	private String name;
	public static class Location{
		private String princes;
		private String city;
		public String getPrinces() {
			return princes;
		}
		public void setPrinces(String princes) {
			this.princes = princes;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString() {
			return "prince:"+princes+",city:"+city;
		}
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
