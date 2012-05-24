package sample.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@SuppressWarnings("serial")
public class Chapter implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private Integer noOfPages;
	
	@ManyToMany(mappedBy="chapters")
	@Cascade(value={CascadeType.SAVE_UPDATE})
	private Set<Book> books = new HashSet<Book>();
	
	public Chapter(){}

	
	public Chapter(String title, Integer noOfPages) {
		super();
		this.title = title;
		this.noOfPages = noOfPages;
	}
	
	
	public Set<Book> getBooks() {
		return books;
	}


	public void setBooks(Set<Book> books) {
		this.books = books;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(Integer noOfPages) {
		this.noOfPages = noOfPages;
	}


	@Override
	public String toString() {
		return "Chapter [title=" + title + ", noOfPages=" + noOfPages
				+ ", bookName=" + "]";
	}
	
}
