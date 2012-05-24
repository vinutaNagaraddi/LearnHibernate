package action.helloworld;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import sample.entity.Message;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloWorldAction extends ActionSupport{
	private Logger logger = Logger.getLogger(this.getClass());
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public String execute(){
		
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Message m1 = new Message("somethiing");
		return SUCCESS;
	}
}
