package dao.ch6and7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import sample.dao.SampleDAO;
import sample.entity.AudioDisc;
import sample.entity.Book;
import sample.entity.Chapter;

public class Chapter6and7DaoImpl  extends SampleDAO implements Chapter6and7Dao {

	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void populateBooks(List<Book> bookList) {
		// TODO Auto-generated method stub
		Iterator<Book> i = bookList.iterator();
		while(i.hasNext()){
			Book book= i.next();
			this.saveOrUpdate(book);
		}
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		
		Book book1 = (Book) this.currentSession().get(Book.class, new Long(23));
		Book book2 = (Book) this.currentSession().get(Book.class, new Long(23));
		logger.debug(book1 == book2);
		
		return  new ArrayList();
	} 
}
