package sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class AudioDisc extends Disc{
	private String singer;
	private Integer numOfSongs;
	
	public AudioDisc(){}
	
	
	public AudioDisc(String name, Integer price, String singer, Integer numOfSongs){
		this.name  = name;
		this.price = price;
		this.singer = singer;
		this.numOfSongs = numOfSongs;
	}
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Integer getNumOfSongs() {
		return numOfSongs;
	}
	public void setNumOfSongs(Integer numOfSongs) {
		this.numOfSongs = numOfSongs;
	}

	@Override
	public String toString() {
		return "AudioDisc [singer=" + singer + ", numOfSongs=" + numOfSongs
				+ ", name=" + name + ", price=" + price + "]";
	}
	
}