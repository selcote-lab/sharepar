package de.idside.sharepar.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import de.idside.sharepar.models.Booking;

public interface BookingDao extends MongoRepository<Booking, String>{

}
