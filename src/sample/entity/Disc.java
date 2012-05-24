package sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.TABLE_PER_CLASS)
public  class  Disc {
	Long id;
	String name;
	Integer price;
	
	public Disc(){};
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	@Column(name="DISC_ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Disc [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
