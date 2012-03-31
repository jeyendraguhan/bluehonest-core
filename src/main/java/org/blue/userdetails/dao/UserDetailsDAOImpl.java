package org.blue.userdetails.dao;

import java.util.List;

import org.blue.userdetails.model.UserDetails;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDetailsDAOImpl extends HibernateDaoSupport implements UserDetailsDAO  {

	@Override
	public void addUserDetails(UserDetails user) {
		getHibernateTemplate().save(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetails> listUserDetails() {
		return getHibernateTemplate().find("from UserDetails");
	}
	

}
