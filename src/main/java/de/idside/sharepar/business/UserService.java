package de.idside.sharepar.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.idside.sharepar.dao.UserDao;
import de.idside.sharepar.models.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> getAll(){
		return this.userDao.findAll();
	}
	
	public void insert(User user){
		 this.userDao.insert(user);
	}
	
	public void update(User user){
		 this.userDao.save(user);
	}

	public void delete(String id) {
		this.userDao.deleteById(id);
		
	}
}
