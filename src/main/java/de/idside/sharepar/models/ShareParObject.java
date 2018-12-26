package de.idside.sharepar.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ShareParObjectCol")
public class ShareParObject extends ObjectAudit{
	
	@Id
	private String id;
	
	private String description;
	
	private String name;
	
	private float price;
	
	private GroupMember groupMember;
	
	private Specification specification;
	
	private PriceUnit priceUnit;
	
	private ObjectContract objectContract;
	
	private String status;
	
	private ObjectLocation objectLocation;
	
	private List<ObjectCalendar> Calendars = new ArrayList<>();
	
	
	public ShareParObject() {
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public GroupMember getGroupMember() {
		return groupMember;
	}
	public void setGroupMember(GroupMember groupMember) {
		this.groupMember = groupMember;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
	}
	public PriceUnit getPriceUnit() {
		return priceUnit;
	}
	public void setPriceUnit(PriceUnit priceUnit) {
		this.priceUnit = priceUnit;
	}
	
	public ObjectContract getObjectContract() {
		return objectContract;
	}
	public void setObjectContract(ObjectContract objectContract) {
		this.objectContract = objectContract;
	}
	public ObjectLocation getObjectLocation() {
		return objectLocation;
	}
	public void setObjectLocation(ObjectLocation objectLocation) {
		this.objectLocation = objectLocation;
	}

	@Override
	public String toString() {
		return "ShareParObject [description=" + description + ", name=" + name + ", price=" + price + "]";
	}
	
}
