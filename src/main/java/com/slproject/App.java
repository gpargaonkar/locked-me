package com.slproject;


import java.io.File;
import java.nio.file.NotDirectoryException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String WELCOME_MESSAGE = "Hello! Welcome to LockedMe.com. This program is developed by Gaurav Pargaonkar (Software Engineer, Pune) \n";
		String MAIN_MENU = "\n"
				+ "Please select one of the options below. \n"
				+ "1: Retrieve all file names from specific directory\n"
				+ "2: Business Level Operations\n"
				+ "3: Close the application"
				+ "\n>>";
		String SUB_MENU = "\n"
				+ "1: To add a new file\n"
				+ "2: To delete file\n"
				+ "3: To search file\n"
				+ "4: To go back to Main Menu"
				+ "\n>>";
		
		boolean flag = true;
		
		System.out.println(WELCOME_MESSAGE);
		
		while(flag) {
			
			
			try {
				System.out.print(MAIN_MENU);
				Scanner in = new Scanner(System.in);
				int op = in.nextInt();
				switch(op) {
				case 1: 
					//Retrieve file names in order
					//System.out.println("CASE 1");
					System.out.print("Please enter path: ");
					Scanner sc = new Scanner(System.in);
					String path = sc.nextLine();
					FileHandlingHelper f = new FileHandlingHelper();
					f.readFileNames(path);
					break;
				case 2:
					//Business Level Operations
					System.out.println("CASE 2");
					boolean flag1 = true;
					while(flag1) {
						
						try {
							System.out.println(SUB_MENU);
							Scanner in1 = new Scanner(System.in);
							int op1 = in1.nextInt();
							switch(op1) {
							case 1: 
								//Create new file
								System.out.println("file created");
								break;
							case 2: 
								System.out.println("file deleted");
								break;
							case 3: 
								System.out.println("file search");
								break;
							case 4: 
								System.out.println("Going back to main menu");
								flag1 = false;
								break;
							default: 
								System.out.println("Invalid entry!!");
								break;
							}
						}catch(Exception e) {
							System.out.println("Invalid entry!! Please try again");
						}
					}
					break;
					
				case 3:
					//Close the application
					System.out.println("CASE 3");
					System.out.println("Thank you for using LockedMe.com");
					flag = false;
					break;
				default: System.out.println("Invalid Entry!! Please try again.");
				}
				
			}catch(NotDirectoryException nd) {
				System.out.println(nd.getMessage());
			}catch(Exception e) {
				System.out.println("Invalid Entry!! Please try again."+e);
			}
			
		}
		
	}

}
