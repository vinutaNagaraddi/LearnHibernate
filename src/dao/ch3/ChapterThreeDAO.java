package dao.ch3;

import java.util.List;

import sample.TransferObject.AdvertTO;
import sample.entity.Address;
import sample.entity.Advert;
import sample.entity.Category;
import sample.entity.Customer;
import sample.entity.Message;
import sample.entity.Orders;
import sample.entity.User;


public interface ChapterThreeDAO {
	void populateMessages(List<Message> messages);

	void populateUsers(List<User> users);

	void populateCategories(List<Category> categories);

	void populateAdverts(List<AdvertTO> adverts);

	void populateCustomers(List<Customer> customers);

	Customer getCustomer(Customer customer1);

	void populateAddress(List<Address> addresses);

	void populateOrder(List<Orders> ordList);
}
