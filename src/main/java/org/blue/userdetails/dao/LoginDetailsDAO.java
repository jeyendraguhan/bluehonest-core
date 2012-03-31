package org.blue.userdetails.dao;

import java.util.List;

import org.blue.userdetails.model.LoginDetails;

public interface LoginDetailsDAO {

	void addLoginDetails(LoginDetails login);

	List<LoginDetails> listLoginDetails();

}
