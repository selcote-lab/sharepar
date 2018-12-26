package com.idside.de.seeder;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.idside.sharepar.dao.UserDao;
import de.idside.sharepar.models.Address;
import de.idside.sharepar.models.Image;
import de.idside.sharepar.models.User;

@Component
public class DbSeeder implements CommandLineRunner{
	private UserDao userRepository;
	
	public DbSeeder(UserDao userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(
					"zouhaire",
					"elakioui",
					22,
					"test1@gmail.com",
					"test123,",
					"visible",
					new Address(
								"street hdhff",
								"nador",
								"62000",
								"morocco"
							),
					new Image("Url")
				);
		
		User user2 = new User(
				"zouhaire2",
				"elakioui2",
				24,
				"test2@gmail.com",
				"test123,2",
				"visible",
				new Address(
							"street hdhff",
							"nador",
							"62000",
							"morocco"
						),
				new Image("Url")
			);
		
		this.userRepository.deleteAll();
		List<User> users = Arrays.asList(user1, user2);
		this.userRepository.saveAll(users);
	}

}
