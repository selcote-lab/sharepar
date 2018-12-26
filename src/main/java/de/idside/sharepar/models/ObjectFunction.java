package de.idside.sharepar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class ObjectFunction {
	
	private String description;
	
	private String name;
	
	public ObjectFunction() {

	}
	public ObjectFunction(String description, String name) {
		super();
		this.description = description;
		this.name = name;

	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ObjectFunction [description=" + description + ", name=" + name + "]";
	}
	
	
	
	
	
}
