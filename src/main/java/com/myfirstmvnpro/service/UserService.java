package com.myfirstmvnpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myfirstmvnpro.dao.impl.UserDaoImpl;
import com.myfirstmvnpro.domain.User;
@Service("userService")
public class UserService {
	@Autowired
	private UserDaoImpl userDao;
	
	@Transactional(readOnly=false)  
    public boolean registe(User user) {  
		userDao.save(user);  
        return false;  
    }  
	@Transactional
	public User getUserById(int id){
		return userDao.get(id);
	}
	
}
