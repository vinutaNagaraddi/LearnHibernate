package sample.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Category {
	private long id;
	private String title;
	private Set<Advert> adverts = new HashSet<Advert>();
	
	Category(){}
	
	public Category (String title){
		this.title = title;
		this.adverts = new HashSet<Advert>();
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(unique=true)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@ManyToMany
	@JoinTable(name="link_category_advert")
	public Set<Advert> getAdverts() {
		return adverts;
	}
	public void setAdverts(Set<Advert> adverts) {
		this.adverts = adverts;
	}
	public void addAdvert(Advert advert){
		getAdverts().add(advert);
	}
}
