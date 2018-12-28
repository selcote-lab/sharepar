package de.idside.sharepar.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import de.idside.sharepar.dao.UserDao;
import de.idside.sharepar.models.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private NotificationService notificationService;
	
	public List<User> getAll(){
		return this.userDao.findAll();
	}
	
	public void insert(User user) throws Exception{
		 this.userDao.insert(user);
		 confirmAccount(user);
		
		 
	}
	
	public void update(User user){
		 this.userDao.save(user);
	}

	public void delete(String id) {
		this.userDao.deleteById(id);
	}
	
	public Optional<User> findById(String id) {
		return this.userDao.findById(id);
	}
	public void confirmAccount(User user) throws MessagingException {
		Context context = new Context();
        context.setVariable("message", "Thanks for activating your account");
        context.setVariable("id", user.getId());
		this.notificationService.sendNotification(user, "Confirmation account", "user-confirmation", "contact@sharepar.com", context);
	}
	
	public Optional<User> enable(String id) {
		Optional<User> userOption = userDao.findById(id);
		if(userOption.isPresent()) 
			userOption.get().setEnabled(true);
		return userOption;
	}
	
}
