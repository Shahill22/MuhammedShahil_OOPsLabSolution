package com.shahil.service;

import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(String firstName,String lastName,String Department) {
		return firstName+lastName+"@"+Department+".Zoho.com";
	}
	public String generatePassword() {
		String allChar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()_";
		Random r = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 16; i++)
        {
            int randomIndex = r.nextInt(allChar.length());
            sb.append(allChar.charAt(randomIndex));
        }
		return sb.toString();
	}
	public void showCredentials(String firstName,String  GeneratedEmail,String GeneratedPassword) {
		System.out.println("Dear "+ firstName +", your generated credentials are as follow:");
		System.out.println("Email ----> " +GeneratedEmail);
		System.out.println("Password ----> "+GeneratedPassword);
	}
}
