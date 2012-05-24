package service.ch6and7;

import java.util.List;

import sample.entity.Book;

public interface Chapter6and7Service {

	void populateBooks(List<Book> books);

	List<Book> getBooks();

}
