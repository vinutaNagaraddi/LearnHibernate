package sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	private Integer id;
	private String messageText;
	
	private Message(){}
	
	public Message (String messageText){
		this.messageText = messageText;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="message_id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
}
