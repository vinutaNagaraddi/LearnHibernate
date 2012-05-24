package dao.ch4;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;

import sample.dao.SampleDAO;
import sample.entity.AudioDisc;
import sample.entity.*;

public class Chapter4DaoImpl extends SampleDAO implements Chapter4Dao  {
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	public void getDiscs() {
		// TODO Auto-generated method stub
		Query audioDiscQuery = this.currentSession().createQuery("from AudioDisc");
		List<AudioDisc> audioDiscList = audioDiscQuery.list();
		Iterator<AudioDisc> i = audioDiscList.iterator();
		while(i.hasNext()){
			AudioDisc audioDisc= i.next();
			logger.debug("AUDIO DISC:  " + audioDisc.toString());
		}
		
		Query videoDiscQuery = this.currentSession().createQuery("from VideoDisc");
		List<Disc> videoDiscList = videoDiscQuery.list();
		Iterator<Disc> videoDiscIt = videoDiscList.iterator();
		while(videoDiscIt.hasNext()){
			Disc videoDisc= videoDiscIt.next();
			logger.debug("VIDEO DISC AS DISC: " + videoDisc.toString());
		}
		
		Query discQuery = this.currentSession().createQuery("from Disc");
		List<Disc> discList = discQuery.list();
		Iterator<Disc> discIt = discList.iterator();
		while(discIt.hasNext()){
			Disc disc= discIt.next();
			logger.debug("DISC:  " + disc.toString());
		}
	}
	
	@Override
	public void populateAudioDiscs(List<AudioDisc> audioDiscList) {
		// TODO Auto-generated method stub
		Iterator<AudioDisc> i = audioDiscList.iterator();
		while(i.hasNext()){
			AudioDisc audioDisc= i.next();
			this.saveOrUpdate(audioDisc);
		}
	}

	@Override
	public void populateVideoDisc(List<VideoDisc> videoDiscList) {
		// TODO Auto-generated method stub
		Iterator<VideoDisc> i = videoDiscList.iterator();
		while(i.hasNext()){
			VideoDisc videoDisc= i.next();
			this.saveOrUpdate(videoDisc);
		}
		
		Disc d = new Disc();
		this.saveOrUpdate(d);
	}

	@Override
	public void populateBooks(List<Book> bookList) {
		// TODO Auto-generated method stub
		Iterator<Book> i = bookList.iterator();
		while(i.hasNext()){
			Book book= i.next();
			
			Query publisherQuery = this.currentSession().createQuery("from Publisher where code =:code");
			publisherQuery.setString("code", book.getPublisher().getCode());
			if(publisherQuery.list() != null && publisherQuery.list().size() == 1)
			{
				Publisher publisher = (Publisher) publisherQuery.uniqueResult();
				book.setPublisher(publisher);
			}
			this.saveOrUpdate(book);
		}
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		Query bookQuery = this.currentSession().createQuery("from Book");
		List<Book> bookList = bookQuery.list();
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()){
			Book book= it.next();
			logger.debug("Book: " + book.toString());
		}
		return bookList;
	}


}
