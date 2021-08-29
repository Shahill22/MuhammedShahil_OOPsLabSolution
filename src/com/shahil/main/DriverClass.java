package com.shahil.main;

import java.util.Scanner;

import com.shahil.model.Employee;
import com.shahil.service.CredentialService;


public class DriverClass {

	public static void main(String[] args) {
		Employee e1 = new Employee("Muhammed","Shahil");
		CredentialService c = new CredentialService();
		System.out.println("Please Enter the Department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		String GeneratedEmail;
		String GeneratedPassword;
	
		if(option==1) {
			GeneratedEmail=c.generateEmailAddress(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"tech");
			GeneratedPassword=c.generatePassword();
			c.showCredentials(e1.getFirstName(), GeneratedEmail, GeneratedPassword);
		}
		else if(option==2) {
			GeneratedEmail=c.generateEmailAddress(e1.getFirstName(),e1.getLastName(),"admin");
			GeneratedPassword=c.generatePassword();
			c.showCredentials(e1.getFirstName(), GeneratedEmail, GeneratedPassword);
		}
		else if(option==3) {
			GeneratedEmail=c.generateEmailAddress(e1.getFirstName(),e1.getLastName(),"hr");
			GeneratedPassword=c.generatePassword();
			c.showCredentials(e1.getFirstName(), GeneratedEmail, GeneratedPassword);
		}
		else if(option==4) {
			GeneratedEmail=c.generateEmailAddress(e1.getFirstName(),e1.getLastName(),"legal");
			GeneratedPassword=c.generatePassword();
			c.showCredentials(e1.getFirstName(), GeneratedEmail, GeneratedPassword);
		}
		else {
			System.out.println("Please Enter the correct Department");
		}
		sc.close();
	}

}
