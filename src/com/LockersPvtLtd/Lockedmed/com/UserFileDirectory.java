package com.LockersPvtLtd.Lockedmed.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class UserFileDirectory {
	private String userName;
	private String userAdd;
	private long mobileNumber;
	private int userAge;

	public UserFileDirectory(String userName, String userAdd, long mobileNumber, int userAge) {
		this.userName = userName;
		this.userAdd = userAdd;
		this.mobileNumber = mobileNumber;
		this.userAge = userAge;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAdd() {
		return userAdd;
	}

	public void setUserAdd(String userAdd) {
		this.userAdd = userAdd;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public void returnFiles() {

	}

}
