package action.ch3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import sample.TransferObject.AdvertTO;
import sample.entity.Address;
import sample.entity.Advert;
import sample.entity.Category;
import sample.entity.Contact;
import sample.entity.Customer;
import sample.entity.CustomerPK;
import sample.entity.Message;
import sample.entity.Orders;
import sample.entity.Period;
import sample.entity.Phone;
import sample.entity.User;
import service.ch3.ChapterThreeService;


import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ChapterThreeAction extends ActionSupport{
	
	private ChapterThreeService chapterThreeService;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public ChapterThreeService getChapterThreeService() {
		return chapterThreeService;
	}

	public void setChapterThreeService(ChapterThreeService chapterThreeService) {
		this.chapterThreeService = chapterThreeService;
	}

	public String populateMessages(){
		
		Message m1 = new Message("message m1");
		Message m2 = new Message("message m2");
		Message m3 = new Message("message m3");
		
		List<Message> messages = new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		this.chapterThreeService.populateMessages(messages);
		
		return SUCCESS;
	}
	
	public String populateUsers(){
		List<User> users = new ArrayList<User>();
		User u1 = new User("user1", "password1");
		User u2 = new User("user2", "password2");
		User u3 = new User("user3", "password3");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		this.chapterThreeService.populateUsers(users);
		return SUCCESS;
	}
	
	public String populateCategories(){
		
		List<Category> categories = new ArrayList<Category>();
		
		Category c1 = new Category("category1");
		Category c2 = new Category("category2");
		Category c3 = new Category("category3");
		
		categories.add(c1);
		categories.add(c2);
		categories.add(c3);
		
		this.chapterThreeService.populateCategories(categories);
		return SUCCESS;
	}
	
	public String populateAdverts(){
		AdvertTO a1 = new AdvertTO("user1", "category1", "advert1", "message1");
		AdvertTO a2 = new AdvertTO("user2", "category2", "advert2", "message2");
		
		List<AdvertTO> advertTO = new ArrayList<AdvertTO>();
		
		advertTO.add(a1);
		advertTO.add(a2);
		
		this.chapterThreeService.populateAdverts(advertTO);
		return SUCCESS;
	}
	
	public String populateCustomers(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c1 = getCustomer1();
		Address a = new Address("Address1", "city1", "state1");
		c1.setAddress(a);
		
		customers.add(c1);
		
		this.chapterThreeService.populateCustomers(customers);
		return SUCCESS;
		
	}

	public String getCustomer(){
		Customer c = this.chapterThreeService.getCustomer(this.getCustomer1());
		logger.debug(c.toString());
		return SUCCESS;
	}
	
	public String populateAddresses(){
		Address address1 = new Address("4716 Ravendale", "Richardson", "Texas");
		Address address2 = new Address("613 El Dorado Dr.", "Dallas", "Texas");
		List<Address>  addresses= new ArrayList<Address>();
		addresses.add(address1);
		addresses.add(address2);
		
		this.chapterThreeService.populateAddress(addresses);
		
		return SUCCESS;
		
	}
	
	public String populateOrders(){
		Phone wdph = new Phone("234", "3444555");
		Phone hdph = new Phone("121", "3456999");
		Phone phone1 = new Phone("214", "4220456");
		Phone phone2 = new Phone("214", "4220455");
		
		Contact weekdayContact = new Contact("John Doe", wdph);
		Contact holidayContact = new Contact("Jane Doe", hdph);
		Contact contact1 = new Contact("vinuta nagaraddi", phone1);
		Contact contact2 = new Contact("venkatesh nagaraddi", phone2);
		
		Date d = new Date();
		
		Calendar c1 =  Calendar.getInstance();
		c1.set(1977, 2, 13);
		
		Calendar c2 =  Calendar.getInstance();
		c2.set(1985, 3, 14);
		
		Calendar c3 =  Calendar.getInstance();
		c3.set(1999, 3, 14);
		
		Period p1 = new Period(c1.getTime(), c2.getTime());
		Period p2 = new Period(c2.getTime(), c3.getTime());
		
		Map<Period,Contact> contacts = new HashMap<Period,Contact>();
		contacts.put(p1, contact1);
		contacts.put(p2, contact2);
		
		Orders ord = new Orders(weekdayContact, holidayContact, contacts, 
				"4716 Ravendale", "613 El Dorado Dr.");
		List<Orders> ordList = new ArrayList<Orders>();
		ordList.add(ord);
		
		this.chapterThreeService.populateOrder(ordList);
		
		return SUCCESS;
		
	}
	
	
	private Customer getCustomer1() {
		Customer c1 = new Customer();
		c1.setFirstName("vinuta");
		c1.setLastName("nagaraddi");
		return c1;
	}
}
