package javaDay5.business.abstracts;

import javaDay5.entities.abstracts.User;

public interface DataCheck {

	public boolean mailCheck(User user);
	public boolean passwordCheck(User user);
	public boolean firstNameCheck(User user);
	public boolean lastNameCheck(User user);
	
}
