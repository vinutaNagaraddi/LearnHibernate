package sample.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import service.ch3.ChapterThreeService;

public class SampleDAO {
	
	private SessionFactory sessionFactory;
	private ChapterThreeService chapterThreeService;
	private Session session = null;
	
	public ChapterThreeService getChapterThreeService() {
		return chapterThreeService;
	}

	public void setChapterThreeService(ChapterThreeService chapterThreeService) {
		this.chapterThreeService = chapterThreeService;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session currentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	protected void saveOrUpdate(Object obj){
		currentSession().saveOrUpdate(obj);
	}
	
	protected void delete(Object obj){
		currentSession().delete(obj);
	}
}
