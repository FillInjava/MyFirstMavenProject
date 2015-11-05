package com.myfirstmvnpro.dao.impl;

import org.springframework.stereotype.Repository;
import com.myfirstmvnpro.domain.User;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> {
	public UserDaoImpl() {
		super(User.class);
	}
}
