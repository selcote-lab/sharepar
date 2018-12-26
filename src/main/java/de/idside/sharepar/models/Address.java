package de.idside.sharepar.models;


public class Address {

	private String address;
	

	private String city;
	

	private String zipCode;
	

	private String country;
	
	
	public Address() {
		
	}
	
	public Address(String address, String city, String zipCode, String country) {
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
