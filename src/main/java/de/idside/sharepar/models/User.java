package de.idside.sharepar.models;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User extends ObjectAudit{
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String email;
	
	private String password;
	
	private String status;
	
	private Address address;
	
	private Image image;
	
	
	public User() {
		
	}

	
	public User(String firstName, String lastName, int age, String email, String password, String status,
			Address address, Image image) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.password = password;
		this.status = status;
		this.address = address;
		this.image = image;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", password=" + password + ", status=" + status + "]";
	}

	

	
	
}
