package org.blue.userdetails.bo;

import java.util.List;

import org.blue.userdetails.dao.LoginDetailsDAO;
import org.blue.userdetails.dao.UserDetailsDAO;
import org.blue.userdetails.model.LoginDetails;
import org.blue.userdetails.model.UserDetails;

public class UserDetailsBoImpl implements UserDetailsBo {
	
	UserDetailsDAO userDetailsDAO;
	LoginDetailsDAO loginDetailsDAO;
	
	public void setUserDetailsDAO(UserDetailsDAO userDetailsDAO) {
		this.userDetailsDAO = userDetailsDAO;
		
	}

	@Override
	public void addUserDetails(UserDetails user) {
		userDetailsDAO.addUserDetails(user);

	}

	@Override
	public List<UserDetails> listUserDetails() {
		return userDetailsDAO.listUserDetails();
	}

	public LoginDetailsDAO getLonginDetailsDAO() {
		return loginDetailsDAO;
	}

	@Override
	public void addLoginDetails(LoginDetails login) {
		loginDetailsDAO.addLoginDetails(login);		
	}

	@Override
	public List<LoginDetails> listLoginDetails() {
		
		return loginDetailsDAO.listLoginDetails();
	}



}
