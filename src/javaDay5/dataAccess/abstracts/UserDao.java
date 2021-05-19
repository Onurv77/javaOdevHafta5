package javaDay5.dataAccess.abstracts;

import java.util.List;

import javaDay5.entities.abstracts.User;

public interface UserDao {

	public void add(User user);
	public void delete(User user);
	public void update(User user);
	public User get(int id);
	List<User> getAll();
	
}
