package com.service;
import com.model.User;

public interface UserService {

	void register(User u);
	boolean login(String un,String pw);
	
}
