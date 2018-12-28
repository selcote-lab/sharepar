package de.idside.sharepar.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.idside.sharepar.models.User;
import de.idside.sharepar.business.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/all")
	public List<User> getAll(){
		return userService.getAll();
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody User user){
		try {
			log.info("Sending Email with Thymeleaf HTML Template Example");
			userService.insert(user);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@PutMapping("/update")
	public void update(@RequestBody User user){
		userService.update(user);;
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") String id){
		userService.delete(id);;
	}
	
	@GetMapping("/findBy/{id}")
	public Optional<User> findById(@PathVariable("id") String id) {
		return this.userService.findById(id);
	}
	
	@GetMapping("/enable/{id}")
	public Optional<User> enable(@PathVariable("id") String id) {
		return this.userService.enable(id);
	}
}
