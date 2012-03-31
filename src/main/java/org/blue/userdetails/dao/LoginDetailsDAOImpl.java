package org.blue.userdetails.dao;

import java.util.List;

import org.blue.userdetails.model.LoginDetails;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class LoginDetailsDAOImpl extends HibernateDaoSupport implements LoginDetailsDAO {

	@Override
	public void addLoginDetails(LoginDetails login) {
		getHibernateTemplate().save(login);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoginDetails> listLoginDetails() {
		return getHibernateTemplate().find("from LoginDetails");
	}

}
