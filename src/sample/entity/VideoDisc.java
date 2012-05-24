package sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class VideoDisc extends Disc{
	private String directory;
	private String language;
	
	public VideoDisc(){}
	
	
	public VideoDisc(String name, Integer price, String directory, String language){
		this.name = name;
		this.price = price;
		this.directory = directory;
		this.language = language;
	}
	
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "VideoDisc [directory=" + directory + ", language=" + language
				+ ", name=" + name + ", price=" + price + "]";
	}
	
	
}
