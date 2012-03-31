package org.blue.userdetails.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.blue.userdetails.bo.UserDetailsBo;
import org.blue.userdetails.model.LoginDetails;
import org.blue.userdetails.model.UserDetails;

import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("rawtypes")
public class UserDetailsAction implements ModelDriven {
	
	UserDetails user = new UserDetails();
	LoginDetails login = new LoginDetails();
	List<UserDetails> userDetailsList = new ArrayList<UserDetails>();
	
	UserDetailsBo userDetailsBo;
	
	public void setUserDetailsBo(UserDetailsBo userDetailsBo) {
		this.userDetailsBo = userDetailsBo;
	}

	@Override
	public Object getModel() {
		return user;
	}

	public List<UserDetails> getUserDetailsList() {
		return userDetailsList;
	}

	public void setUserDetailsList(List<UserDetails> userDetailsList) {
		this.userDetailsList = userDetailsList;
	}
	
	public String addUserDetails() throws Exception	{
		
		user.setRegDate(new Date());
		
		userDetailsBo.addUserDetails(user);
		
		userDetailsList = null;
		userDetailsList = userDetailsBo.listUserDetails();
		
		return "success";
	}
	
	public String listUserDetails() throws Exception	{
		userDetailsList = userDetailsBo.listUserDetails();
		
		return "success";
	}
	

}
