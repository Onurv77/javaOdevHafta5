package javaDay5.entities.concretes;

import javaDay5.entities.abstracts.User;

public class Member extends User {

	
	public Member() {}
	
	public Member(String mail, String password, String firstName, String LastName) {
		this.setEmail(mail.strip());
		this.setPassword(password.strip());		
		this.setFirstName(firstName.strip());
		this.setLastName(LastName.strip());
	}
	
	
}
