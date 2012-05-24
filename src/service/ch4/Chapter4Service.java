package service.ch4;

import java.util.List;

import sample.entity.AudioDisc;
import sample.entity.Book;
import sample.entity.VideoDisc;

public interface Chapter4Service {

	void getDiscs();

	void populateAudioDiscs(List<AudioDisc> audioDiscList);

	void populateVideoDiscs(List<VideoDisc> videoDiscList);

	void populateBooks(List<Book> bookList);

	List<Book> getBooks();

}