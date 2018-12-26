package de.idside.sharepar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

public class ObjectLocation extends Address {
	
	private String latitude;
	
	private String longitude;
	
	
	public ObjectLocation() {
	}

	public ObjectLocation(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "ObjectLocation [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
}
