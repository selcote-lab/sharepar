package de.idside.sharepar.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public class GroupMember extends ObjectAudit{
	
	private String Description;
	

	private List<User> members = new ArrayList<>(); 
	
	public GroupMember() {
		
	}

	public GroupMember(String description) {
		super();
		Description = description;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
}
