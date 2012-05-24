package service.ch3;

import java.util.List;

import dao.ch3.ChapterThreeDAO;

import sample.TransferObject.AdvertTO;
import sample.entity.Address;
import sample.entity.Advert;
import sample.entity.Category;
import sample.entity.Customer;
import sample.entity.Message;
import sample.entity.Orders;
import sample.entity.User;

public class ChapterThreeServiceImpl implements ChapterThreeService{

	private ChapterThreeDAO chapterThreeDAO;
	
	
	public ChapterThreeDAO getChapterThreeDAO() {
		return chapterThreeDAO;
	}


	public void setChapterThreeDAO(ChapterThreeDAO chapterThreeDAO) {
		this.chapterThreeDAO = chapterThreeDAO;
	}


	@Override
	public void populateMessages(List<Message> message) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateMessages(message);
	}


	@Override
	public void populateUsers(List<User> users) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateUsers(users);
	}


	@Override
	public void populateCategories(List<Category> categories) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateCategories(categories);
	}


	@Override
	public void populateAdverts(List<AdvertTO> adverts) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateAdverts(adverts);
	}


	@Override
	public void populateCustomers(List<Customer> customers) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateCustomers(customers);
	}


	@Override
	public Customer getCustomer(Customer customer1) {
		// TODO Auto-generated method stub
		return this.chapterThreeDAO.getCustomer(customer1);
	}


	@Override
	public void populateAddress(List<Address> addresses) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateAddress(addresses);
	}


	@Override
	public void populateOrder(List<Orders> ordList) {
		// TODO Auto-generated method stub
		this.chapterThreeDAO.populateOrder(ordList);
	}
	
	
}
