package dao.ch3;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Query;

import sample.TransferObject.AdvertTO;
import sample.dao.SampleDAO;
import sample.entity.Address;
import sample.entity.Advert;
import sample.entity.Category;
import sample.entity.Contact;
import sample.entity.Customer;
import sample.entity.Message;
import sample.entity.Orders;
import sample.entity.Period;
import sample.entity.User;

public class ChapterThreeDAOImpl extends SampleDAO implements ChapterThreeDAO {
private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void populateMessages(List<Message> messages) {
		// TODO Auto-generated method stub
		Iterator<Message> i = messages.iterator();
		while(i.hasNext()){
			Message m = i.next();
			this.saveOrUpdate(m);
		}
	}

	@Override
	public void populateUsers(List<User> users) {
		// TODO Auto-generated method stub
		Iterator<User> i = users.iterator();
		while(i.hasNext()){
			User user = i.next();
			this.saveOrUpdate(user);
		}
	}

	@Override
	public void populateCategories(List<Category> categories) {
		// TODO Auto-generated method stub
		Iterator<Category> i = categories.iterator();
		while(i.hasNext()){
			Category category = i.next();
			this.saveOrUpdate(category);
		}
	}

	@Override
	public void populateAdverts(List<AdvertTO> adverts) {
		// TODO Auto-generated method stub
		
		Iterator<AdvertTO> i = adverts.iterator();
		while(i.hasNext()){
			AdvertTO advertTO = i.next();
			Query userQuery = this.currentSession().createQuery("from User where name =:username");
			userQuery.setString("username", advertTO.getUserName());
			User user = (User) userQuery.uniqueResult();
			logger.debug(user.toString());
			
			Query categoryQuery = this.currentSession().createQuery("from Category where title =:categoryTitle");
			categoryQuery.setString("categoryTitle", advertTO.getCategoryTitle());
			Category category = (Category) categoryQuery.uniqueResult();
			logger.debug(category.toString());
			
			Advert advert = new Advert(advertTO.getAdvertTitle(), advertTO.getMessage(), user);
			this.saveOrUpdate(advert);
			
			category.addAdvert(advert);
			this.saveOrUpdate(category);
		}
	}

	@Override
	public void populateCustomers(List<Customer> customers) {
		// TODO Auto-generated method stub
		
		Iterator<Customer> i = customers.iterator();
		while(i.hasNext()){
			Customer m = i.next();
			this.saveOrUpdate(m);
		}
		
	}

	@Override
	public Customer getCustomer(Customer customer1) {
		// TODO Auto-generated method stub
		List<Customer> customers = this.currentSession().createQuery("from newCustomerName").list();
		logger.debug(customers.size());
		
		Customer customer = (Customer) this.currentSession().get(Customer.class,customer1.getId());
		logger.debug(customer1.equals(customer));
		logger.debug(customer1 == customer);
		return customer;
	}

	@Override
	public void populateAddress(List<Address> addresses) {
		// TODO Auto-generated method stub
		Iterator<Address> i = addresses.iterator();
		while(i.hasNext()){
			Address address = i.next();
			this.saveOrUpdate(address);
		}
	}

	@Override
	public void populateOrder(List<Orders> ordList) {
		// TODO Auto-generated method stub
		Iterator<Orders> i = ordList.iterator();
		while(i.hasNext()){
			Orders order = i.next();
			
			Query weekdayContactAddressQuery = this.currentSession().createQuery("from Address where address1 =:address1");
			weekdayContactAddressQuery.setString("address1", order.getWeekdayContactAddress());
			Address weekdayContactAddress = (Address) weekdayContactAddressQuery.uniqueResult();
			
			order.getWeekdayContact().setAddress(weekdayContactAddress);
			
			
			Query holidayContactAddressQuery = this.currentSession().createQuery("from Address where address1 =:address1");
			holidayContactAddressQuery.setString("address1", order.getHolidayContactAddress());
			Address holidayContactAddress = (Address) holidayContactAddressQuery.uniqueResult();
			
			order.getHolidayContact().setAddress(holidayContactAddress);

			Map<Period,Contact> contacts = order.getContacts();
			Set<Period> keySet =  contacts.keySet();
			Iterator<Period> ic = keySet.iterator();
			while(ic.hasNext()){
				Contact contact = contacts.get(ic.next());
				contact.setAddress(weekdayContactAddress);
			}
			
			this.saveOrUpdate(order);
		}
	}	
}
