package de.idside.sharepar.models;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "BookingCol")
public class Booking extends ObjectAudit{
	@Id
	private String id;
	
	private String transaction;
	
	private User user;
	
	private ShareParObject shareParObject;
	
	
	private ObjectCalendar objectCalendar;
	
	public Booking() {
		
	}
	
	public Booking(String transaction, User user, ShareParObject shareParObject, ObjectCalendar objectCalendar) {
		this.transaction = transaction;
		this.user = user;
		this.shareParObject = shareParObject;
		this.objectCalendar = objectCalendar;
	}
	
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShareParObject getShareParObject() {
		return shareParObject;
	}

	public void setShareParObject(ShareParObject shareParObject) {
		this.shareParObject = shareParObject;
	}

	public ObjectCalendar getObjectCalendar() {
		return objectCalendar;
	}

	public void setObjectCalendar(ObjectCalendar objectCalendar) {
		this.objectCalendar = objectCalendar;
	}	
}
