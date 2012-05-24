package sample.entity;

import javax.persistence.Embeddable;
import javax.persistence.Table;

public class Contact{
	private String recipient;
	private Phone phone;
	private Address address;
	private Orders order;

	public Contact() {
		// TODO Auto-generated constructor stub
	}
	
	public Contact(String recipient, Phone phone) {
		super();
		this.recipient = recipient;
		this.phone = phone;
	}
	
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}