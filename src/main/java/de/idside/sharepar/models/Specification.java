package de.idside.sharepar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


public class Specification {
	
	private String description;
	
	private ObjectLocation objectLocation;
	
	private ObjectFeature  objectFeature;
	
	private Image image;
	
	
	public Specification() {
		
	}
	
	public Specification(String description, 
			ObjectLocation objectLocation,
			ObjectFeature objectFeature, 
			Image image
			) {
		this.description = description;
		this.objectLocation = objectLocation;
		this.objectFeature = objectFeature;
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ObjectLocation getObjectLocation() {
		return objectLocation;
	}
	public void setObjectLocation(ObjectLocation objectLocation) {
		this.objectLocation = objectLocation;
	}
	public ObjectFeature getObjectFeature() {
		return objectFeature;
	}
	public void setObjectFeature(ObjectFeature objectFeature) {
		this.objectFeature = objectFeature;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Specification [description=" + description + ", image=" + image + "]";
	}
	
}
