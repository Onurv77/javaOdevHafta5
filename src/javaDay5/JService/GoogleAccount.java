package javaDay5.JService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleAccount {

	public void register(String mail){
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@gmail.com",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(mail);
		boolean matchFound = matcher.find();
		
		
		if (!matchFound) {
			System.out.println("Yanlýþ hesap girdiniz.");
		}
		
	}
	
}
