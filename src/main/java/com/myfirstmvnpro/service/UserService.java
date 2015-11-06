package com.myfirstmvnpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myfirstmvnpro.dao.impl.BaseDaoImpl;
import com.myfirstmvnpro.dao.impl.UserDaoImpl;
import com.myfirstmvnpro.dao.inter.BaseDao;
import com.myfirstmvnpro.domain.User;
@Service("userService")
public class UserService {
	@Autowired
	private BaseDao<User> userDaoImpl;
	
	@Transactional(readOnly=false)  
    public boolean registe(User user) {  
		userDaoImpl.save(user);  
        return false;  
    }  
	@Transactional(readOnly=true)
	public User getUserById(int id){
		return userDaoImpl.get(id);
	}
	
}
