package javaDay5.business.concretes;

import javaDay5.business.abstracts.UserService;
import javaDay5.dataAccess.abstracts.UserDao;
import javaDay5.entities.abstracts.User;

public class UserManager implements UserService {

	private UserDao userdao;

	@Override
	public void deleted(User user) {

		this.userdao.delete(user);
		
	}

	@Override
	public void updated(User user) {

		this.userdao.update(user);
		
	}

	@Override
	public void add(User user) {
		
		this.userdao.add(user);
		
	}
		
	
	

}
