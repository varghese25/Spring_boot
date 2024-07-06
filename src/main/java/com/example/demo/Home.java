package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Add in Spring Container
public class Home {
	private String owner;
	private int doorNo;
	
	@Autowired
	private InternetConnection modem; // Add new modem variable of InternetConnection class Autowired

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public void connect() { // connect method belong to home class
		modem.switchOn(); // InternetConnection Class Method
		System.out.println("Connecting to Internet: Dependancy Injection" );
	}
}
