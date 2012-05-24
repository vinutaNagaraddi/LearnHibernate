package sample.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Publisher implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PUBLISHER_ID")
	private Long id;
	private String code;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="publisher")
	@LazyCollection(LazyCollectionOption.FALSE)
	@Cascade(value={CascadeType.DELETE_ORPHAN})
	private Set<Book> books;
	
	public Publisher(){}
	
	public Publisher(String code, String name, String address) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Set<Book> getBooks() {
		return books;
	}

	public void setBook(Set<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", code=" + code + ", name=" + name
				+ ", address=" + address + "]";
	}
	
}
