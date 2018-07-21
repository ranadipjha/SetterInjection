package com.rana.beans;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;

	public WishGenerator() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String generateWishMsg() {
		return "Good Morning :" + name + "->" + date;
	}

}
