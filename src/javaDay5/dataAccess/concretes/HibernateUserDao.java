package javaDay5.dataAccess.concretes;

import java.util.List;

import javaDay5.dataAccess.abstracts.UserDao;
import javaDay5.entities.abstracts.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" eklenmiþtir.");
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println(user.getFirstName()+" silinmiþtir.");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println(user.getFirstName()+" güncellenmiþtir.");
		
	}

	@Override
	public User get(int id) {
		
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<User> getAll() {
		
		// TODO Auto-generated method stub
		return null;
		
	}

}
