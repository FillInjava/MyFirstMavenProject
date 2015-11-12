package com.myfirstmvnpro.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myfirstmvnpro.dao.impl.BaseDaoImpl;
import com.myfirstmvnpro.dao.inter.BaseDao;
import com.myfirstmvnpro.domain.User;
@Service("userService")
@Transactional(readOnly = true)
public class UserService {
	@Resource(name="userDaoImpl")
	private BaseDao<User> userDaoImpl;
	/**
	 * 只读。添加不进去
	 * @param user
	 * @return
	 */
	@Transactional(readOnly=true)  
    public boolean registe(User user) {  
		userDaoImpl.save(user);  
        return false;  
    }  
	@Transactional(readOnly=true)
	public User getUserById(int id){
		return userDaoImpl.get(id);
	}
	@Transactional
	public List<User> getAllUsers(){
		return userDaoImpl.getListByHQL("from User ", null);
	}
	
}
