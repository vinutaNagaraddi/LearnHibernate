package sample.entity;

import java.io.Serializable;

import javax.persistence.Entity;



//@Entity()
//@org.hibernate.annotations.Entity(dynamicInsert=true, dynamicUpdate=true)
//@Table(name="CUST")
public class Customer implements Serializable {
	private Long id;
	private String firstName;
	private String lastName;
	private Address address;
	
	public Customer(){}
	
	public Customer(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}
