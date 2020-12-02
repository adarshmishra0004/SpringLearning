package com.adarsh.beans;

import java.util.Date;

public class WishMessageGenerator {
	Date date;
	
	//constructor to set Date obj to WishMessageGenerator obj
	public WishMessageGenerator(Date date) {
		this.date = date;
	}


	int hour;

	
	public String wishUser(String name) {
		hour=date.getHours() ;
		if(hour<12) 
			return "Good Morning "+name;
		else if(hour<16)
			return "Good Afternoon "+name;
		else if(hour<20)
			return "Good Evening"+name;
		else
			return "Good Night "+name;
	}
}
