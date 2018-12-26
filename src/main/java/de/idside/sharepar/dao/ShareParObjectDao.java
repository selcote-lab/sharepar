package de.idside.sharepar.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import de.idside.sharepar.models.ShareParObject;
import de.idside.sharepar.models.User;

@Repository
public interface ShareParObjectDao extends MongoRepository<ShareParObject, String> {

}
