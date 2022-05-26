package com.LockersPvtLtd.Lockedmed.com;

import java.io.IOException;
import java.util.Scanner;

public class LockedMeDriver {
	public static void main(String[] args) throws IOException {
		Scanner userInput = new Scanner(System.in);
		DevDetails devDetails = new DevDetails();
		System.out.println("Wellcome! to the Lockedme.com ");
		System.out.println("Devoloped by");
		devDetails.developersDetials();
		UserFileDirectory userFilesDirectory = new UserFileDirectory("Lucifer MorningStar", "Lex. L.A", 23546789L, 156);
		userFilesDirectory.displayOptionsForFurtherOperations();
		userFilesDirectory.addNewUserFile();
		//use switch case
		
	}

}
