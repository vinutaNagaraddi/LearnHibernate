package dao.ch6and7;

import java.util.List;

import sample.entity.Book;

public interface Chapter6and7Dao {

	void populateBooks(List<Book> bookList);

	List<Book> getBooks();

}
