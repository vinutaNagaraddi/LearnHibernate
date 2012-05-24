package action.ch4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import sample.entity.AudioDisc;
import sample.entity.Book;
import sample.entity.Publisher;
import sample.entity.VideoDisc;
import service.ch4.Chapter4Service;

public class Chapter4Action extends ActionSupport {
	private Logger logger = Logger.getLogger(this.getClass());
	private Chapter4Service chapter4Service;
	
	
	
	

	public Chapter4Service getChapter4Service() {
		return chapter4Service;
	}

	public void setChapter4Service(Chapter4Service chapter4Service) {
		this.chapter4Service = chapter4Service;
	}
	
	public String populateVideoDiscs(){
		VideoDisc videoDisc = new VideoDisc("videoDisc1", 20, "directory1", "lanuguage1");
		
		List<VideoDisc>  videoDiscList = new ArrayList<VideoDisc>();
		videoDiscList.add(videoDisc);
		
		this.chapter4Service.populateVideoDiscs(videoDiscList);
		return SUCCESS;
	}
	
	public String populateAudioDiscs(){
		AudioDisc audioDisc = new AudioDisc("audioDisc1" ,13, "singer1", 4);
		
		List<AudioDisc> audioDiscList = new ArrayList<AudioDisc>();
		audioDiscList.add(audioDisc);
		
		this.chapter4Service.populateAudioDiscs(audioDiscList);
		return SUCCESS;
	}
	
	public String populateBooks(){
		Publisher p = new Publisher("code", "publisherName1", "address1");
		Book b = new Book("234234234", p, Calendar.getInstance().getTime(), 12, "book name1" );
		//p.setBook(b);
		
		Book b2 = new Book("11111", p, Calendar.getInstance().getTime(), 11, "book name2" );
		
		List<Book>  bookList = new ArrayList<Book>();
		bookList.add(b);
		//bookList.add(b2);
		
		this.chapter4Service.populateBooks(bookList);
		
		return SUCCESS;
	}
	
	public String getBooks(){
		List<Book>  bookList = this.chapter4Service.getBooks();
		Iterator<Book> i = bookList.iterator();
		while(i.hasNext()){
			Book book = i.next();
			logger.debug(book);
		}
		return SUCCESS;
	}
	
	public String getDiscs(){
		this.chapter4Service.getDiscs();
		return SUCCESS;
	}
}
