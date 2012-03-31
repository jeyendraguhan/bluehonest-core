package org.blue.userdetails.dao;

import java.util.List;

import org.blue.userdetails.model.UserDetails;

public interface UserDetailsDAO {

	public void addUserDetails(UserDetails user);
	public List<UserDetails> listUserDetails();
}
