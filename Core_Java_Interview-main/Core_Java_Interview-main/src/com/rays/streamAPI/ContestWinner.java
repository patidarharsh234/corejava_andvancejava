package com.rays.streamAPI;

public class ContestWinner {
	public String name;
	public String phoneNo;

	public ContestWinner(String name, String phoneNo) {
		this.phoneNo = phoneNo;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

}
