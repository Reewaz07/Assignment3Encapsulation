package com.service;
import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.User;

public class UserServiceImpl implements UserService{

	@Override
	public void register(User u) {
	String sql="Insert into user(fname,lname,email,password)values('"+u.getFname()+"','"+u.getLname()+"','"+u.getEmail()+"','"+u.getUsername()+"','"+u.getPassword()+"')";
	try {
		Statement stm=DB.getDB().createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}

	@Override
	public boolean login(String un, String psw) {
		String sql="Select*from user where name='"+un+'"and password='"+psw+"' ";
		return false;
	}
	

}
