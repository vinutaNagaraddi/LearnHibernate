package sample.entity;

import java.util.Map;
import java.util.Set;

import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Parent;

//@Entity(name = "ORDERS")
public class Orders {
	private Long id;
	private Contact weekdayContact;
	private Contact holidayContact;
	private Map<Period,Contact>  contacts;
	private String weekdayContactAddress;
	private String holidayContactAddress;
	
	
	public Orders(Contact weekdayContact, Contact holidayContact,Map<Period,Contact> contacts,
			String weekdayContactAddress, String holidayContactAddress) {
		// TODO Auto-generated constructor stub
		
		super();
		this.weekdayContact = weekdayContact;
		this.holidayContact = holidayContact;
		this.contacts = contacts;
		this.weekdayContactAddress = weekdayContactAddress;
		this.holidayContactAddress = holidayContactAddress;
	}


	//@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getWeekdayContactAddress() {
		return weekdayContactAddress;
	}


	public void setWeekdayContactAddress(String weekdayContactAddress) {
		this.weekdayContactAddress = weekdayContactAddress;
	}


	public String getHolidayContactAddress() {
		return holidayContactAddress;
	}


	public void setHolidayContactAddress(String holidayContactAddress) {
		this.holidayContactAddress = holidayContactAddress;
	}


	//	@Embedded
//	@AttributeOverrides({@AttributeOverride(name="recipient", column=@Column(name="WEEKDAY_RECIPIENT")),
//			@AttributeOverride(name="phone", column=@Column(name="WEEKDAY_PHONE")),
//			@AttributeOverride(name="address", column=@Column(name="WEEKDAY_ADDRESS"))})
	public Contact getWeekdayContact() {
		return weekdayContact;
	}

	public void setWeekdayContact(Contact weekdayContact) {
		this.weekdayContact = weekdayContact;
	}

//	@Embedded
//	@AttributeOverrides({@AttributeOverride(name="recipient", column=@Column(name="HOLIDAY_RECIPIENT")),
//			@AttributeOverride(name="phone", column=@Column(name="HOLIDAY_PHONE")),
//			@AttributeOverride(name="address", column=@Column(name="HOLIDAY_ADDRESS"))})
	public Contact getHolidayContact() {
		return holidayContact;
	}

	public void setHolidayContact(Contact holidayContact) {
		this.holidayContact = holidayContact;
	}

//	@CollectionOfElements(targetElement=Contact.class, fetch=FetchType.EAGER)
//	 @JoinTable(name="ORDERS_CONTACT",
//			    joinColumns= @JoinColumn(name="ORDER_ID"))
	public Map<Period,Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Map<Period,Contact> contacts) {
		this.contacts = contacts;
	}

	
}


