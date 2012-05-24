package sample.entity;

public class Address {
	private Long id;
	private String address1;
	private String city;
	private String state;
	private Customer customer;
	
	public Address(){}

	public Address(String address1, String city, String state) {
		// TODO Auto-generated constructor stub
		this.address1 = address1;
		this.city = city;
		this.state = state;
	}

	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
