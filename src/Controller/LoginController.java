package Controller;

import java.util.Scanner;

import Service.LoginService;
import Service.SignupService;

public class LoginController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome!!! please enter Login or Signup:");
		String value=sc.next();
		switch(value.toLowerCase()) {
		
		case "login":{
			System.out.println("To Login enter your username and password:");
			String userName=sc.next();
			String password=sc.next();
			
			LoginService ls=new LoginService();
			boolean result=ls.save(userName, password);
			if(result) {
				System.out.println("Login is successful");
			}else {
				System.out.println("Login failed");
			}
			
			break;
		}
		case "signup":{
			System.out.println("Enter your username,password, email and phonenumber:");
			String userName=sc.next();
			String password=sc.next();
			String email=sc.next();
			int phoneNumber=sc.nextInt();
			
			SignupService ss=new SignupService();
			boolean result =ss.save(userName,password,email,phoneNumber);
			if(result) {
				System.out.println("signup is successful");
			}else {
				System.out.println("signup failed");
			}
			break;
		}
		default:{
			System.out.println("please enter valid details");
		}
		
		}
	}

}
