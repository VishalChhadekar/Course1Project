package com.LockersPvtLtd.Lockedmed.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockedMeDriver {
	public static <T> void main(String[] args) throws IOException {
		try (Scanner userInput = new Scanner(System.in)) {
			DevDetails devDetails = new DevDetails();
			System.out.println("Wellcome! to the Lockedme.com ");
			System.out.println("Devoloped by");
			devDetails.developersDetials();

			List<UserFileDirectory> fileDirectory = new ArrayList<>();
			fileDirectory.add(new UserFileDirectory("Lucifer MorningStar", "Lex. L.A", 23546789L, 35));
			fileDirectory.add(new UserFileDirectory("Morphius", "Hevan", 23571882L, 56));
			fileDirectory.add(new UserFileDirectory("Amenedil", "L.A", 246727638L, 47));
			System.out.println();
			System.out.println("Choose an option and enter for 1-4");
			System.out.println("1. To get all files from directory in ascending order\n"
					+ "2. To perform business operations \n3. Back to the main menu\n" + "4. To close the application ");

			// user input:
			int userResponse = userInput.nextInt();
			System.out.println("User Entered: " + userResponse);

			// use switch statement to perform further operations
			switch (userResponse) {
			// Case statements
			case 1:
				// call a method to sort files directory in ascending order
				break;
			case 2:
				performBusinessOperations();
				int in = userInput.nextInt();
				switch(in) {
				case 1:
					//call a method to add a new file 
					break;
				case 2:
					//delete a file
					break;
				case 3:
					//Search a file by it's name
					break;
				
				}
				break;
			case 3:
				//Navigate the main menu (i.e. repeat the process from 1)
				break;
			case 4:
				//close the application
//				System.exit(0);
				break;
			// Default case statement
			default:
				System.out.println("Thank you for using the Lockme.com");
			}
		}

		// file will be added
//		for (UserFileDirectory ele : fileDirectory) {
//			ele.addNewUserFile();
//		}

	}
	
	public static void performBusinessOperations() {
		System.out.println("Choose following options:");
		System.out.println("1. To add a file to the directory\n" + "2. To delete a file\n3. To search a file");
	}
	//methdo to add a new file to the directory
//	public static void addNewUserFile() throws IOException {
//		
//		String useName = ;
//		File newUserFile = new File("A://Simpli_Learn//Java Full Stack Development//Course1//" + useName + ".txt");
//
//		// Create the file
//		if (newUserFile.createNewFile()) {
//			System.out.println("File is created!");
//		} else {
//			System.out.println("File already exists.");
//		}
//
//		// Write Content
//		FileWriter WritingUserDetials = new FileWriter(newUserFile);
//		WritingUserDetials.write("User Name: " + userName + "\nAddress: " + userAdd + "\nMob. Number:" + mobileNumber
//				+ "\n" + "Age: " + userAge);
//		WritingUserDetials.close();
//	}

}
