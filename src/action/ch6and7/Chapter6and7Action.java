package action.ch6and7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.log4j.Logger;

import sample.entity.Book;
import sample.entity.Chapter;
import sample.entity.Publisher;
import service.ch6and7.Chapter6and7Service;

import com.opensymphony.xwork2.ActionSupport;

public class Chapter6and7Action extends ActionSupport {
	
	Chapter6and7Service chapter6and7Service;
	private Logger logger = Logger.getLogger(this.getClass());
	
	public Chapter6and7Service getChapter6and7Service() {
		return chapter6and7Service;
	}


	public void setChapter6and7Service(Chapter6and7Service chapter6and7Service) {
		this.chapter6and7Service = chapter6and7Service;
	}


	public String populateBooks(){
		List<Book> books = new ArrayList();
		
		Publisher p = new Publisher("code", "publisherName1", "address1");
		
		Publisher p1 = new Publisher("code2", "publisherName2", "address2");
		
		Book b = new Book("234234234", p, Calendar.getInstance().getTime(), 12, "book name1");
		Book b1 = new Book("1111", p, Calendar.getInstance().getTime(), 20, "book name2");
		
		Book b2 = new Book("222221", p1, Calendar.getInstance().getTime(), 10, "book name3");
		
		Set<Chapter> chapters1 = new HashSet<Chapter>();
		Chapter chapter1 = new Chapter("chapter1", 10);
		Chapter chapter2 = new Chapter("chapter2", 20);
		Chapter chapter3 = new Chapter("chapter3", 30);
		
		chapters1.add(chapter1);
		chapters1.add(chapter2);
		chapters1.add(chapter3);
		
		Set<Chapter> chapters2 = new HashSet<Chapter>();
		Chapter chapter4 = new Chapter("chapter4", 40);
		chapters2.add(chapter4);
		
		
		Set<Chapter> chapters3 = new HashSet<Chapter>();
		chapters3.add(chapter1);
		chapters3.add(chapter2);
		chapters3.add(chapter3);
		chapters3.add(chapter4);
		
		
		b.setChapters(chapters1);
		b1.setChapters(chapters2);
		b2.setChapters(chapters3);
		
		books.add(b);
		books.add(b1);
		books.add(b2);
		
		this.chapter6and7Service.populateBooks(books);
		
		return SUCCESS;
	}
	
	public String getBooks(){
		List<Book>  bookList = this.chapter6and7Service.getBooks();
		Iterator<Book> i = bookList.iterator();
		while(i.hasNext()){
			Book book= i.next();
			logger.debug(book);
		}
		return SUCCESS;
	}
}
