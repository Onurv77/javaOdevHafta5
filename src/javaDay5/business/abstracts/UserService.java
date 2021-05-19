package javaDay5.business.abstracts;

import javaDay5.entities.abstracts.User;

public interface UserService {

	public void add(User user);
	public void deleted(User user);
	public void updated(User user);
	
}
