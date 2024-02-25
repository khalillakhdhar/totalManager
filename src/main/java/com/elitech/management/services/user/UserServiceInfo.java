package com.elitech.management.services.user;

import java.util.List;

import com.elitech.management.model.users.User;

public interface UserServiceInfo {
	public User getOneUser(String email);
	public User addUser(User user);
	public List<User> getAllUser();
	public User getUser(long id);

}
