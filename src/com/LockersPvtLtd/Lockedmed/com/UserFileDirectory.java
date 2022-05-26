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
	
	

	//to display options for the user to for further navigation
	public void displayOptionsForFurtherOperations() {
		System.out.println();
		System.out.println("Choose an option and enter for 1-4");
		System.out.println("1. To get all files from directory in ascending order\n"
				+ "2. To perform business operations \n3. Back to the main menu\n"
				+ "4. To close the application ");
	}
	
	public void performBusinessOperations() {
		System.out.println("Choose following options:");
		System.out.println("1. To add a file to the directory\n "
				+ "2. To delete a file\n3. To search a file");
	}
	
	public void addNewUserFile() throws IOException{
        String useName = this.userName;
		File newUserFile = new File("A://Simpli_Learn//Java Full Stack Development//Course1//"+useName + ".txt");
        
        //Create the file
        if (newUserFile.createNewFile()){
          System.out.println("File is created!");
        }else{
          System.out.println("File already exists.");
        }
         
        //Write Content
        FileWriter WritingUserDetials = new FileWriter(newUserFile);
        WritingUserDetials.write("User Name: " + userName + "\nAddress: "+ userAdd+ "\nMob. Number:"+ mobileNumber+ "\n"
        		+ "Age: "+ userAge);
        WritingUserDetials.close();

	}

}

























