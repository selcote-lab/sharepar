package de.idside.sharepar.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.cdi.MongoRepositoryBean;
import org.springframework.stereotype.Repository;

import de.idside.sharepar.models.User;

@Repository
public interface UserDao extends MongoRepository<User, String>{
	Optional<User> findById(String id);
}
