package sample.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
@Entity
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String isbn;
	
	@ManyToOne
	@Cascade(value=CascadeType.SAVE_UPDATE)
	@JoinColumn(name="PUBLISHER_ID")
	private Publisher publisher;
	
	private Date publishDate;
	private Integer price;
	private String name;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany
	@JoinTable(name="BOOK_CHAPTER", joinColumns=@JoinColumn(name="BOOK_ID"),
			inverseJoinColumns=@JoinColumn(name="CHAPTER_ID"))
	@Cascade(value={CascadeType.SAVE_UPDATE, CascadeType.DELETE_ORPHAN})
	private Set<Chapter> chapters; 
	
	public Book(){}
	
	public Book(String isbn, Publisher publisher, Date publishDate,
			Integer price, String name) {
		super();
		this.isbn = isbn;
		this.publisher = publisher;
		this.publishDate = publishDate;
		this.price = price;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Set<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", publisher=" + publisher
				+ ", publishDate=" + publishDate + ", price=" + price
				+ ", name=" + name + ", chapters=" + chapters + "]";
	}

}
