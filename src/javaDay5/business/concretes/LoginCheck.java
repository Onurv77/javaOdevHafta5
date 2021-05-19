package javaDay5.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javaDay5.business.abstracts.DataCheck;
import javaDay5.entities.abstracts.User;



public class LoginCheck implements DataCheck{
	
	public boolean mailCheck(User user) {
		
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[@]+[a-z]+.+[a-z]",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getEmail());
		boolean matchFound = matcher.find();
		
		return matchFound;
		
	}
	
	public boolean  passwordCheck(User user) {
		
		if (user.getPassword().length() > 5) {
			return true;
		}else {
			return false;
		}
						
	}
	
	public boolean firstNameCheck(User user) {
		if (user.getFirstName().length() > 1) {
			return true;
		}else {
			return false;
		}
	}

	
	public boolean lastNameCheck(User user) {
		if (user.getLastName().length() > 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
