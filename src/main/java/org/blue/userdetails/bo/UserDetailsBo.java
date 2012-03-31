package org.blue.userdetails.bo;

import java.util.List;

import org.blue.userdetails.model.LoginDetails;
import org.blue.userdetails.model.UserDetails;

public interface UserDetailsBo {
	
	void addUserDetails(UserDetails user);
	List<UserDetails> listUserDetails();
	void addLoginDetails(LoginDetails login);
	List<LoginDetails> listLoginDetails();

}
