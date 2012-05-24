package service.ch6and7;

import java.util.List;

import sample.entity.Book;

import dao.ch6and7.Chapter6and7Dao;

public class Chapter6and7ServiceImpl implements Chapter6and7Service{
	Chapter6and7Dao chapter6and7Dao;
	
	
	public Chapter6and7Dao getChapter6and7Dao() {
		return chapter6and7Dao;
	}


	public void setChapter6and7Dao(Chapter6and7Dao chapter6and7Dao) {
		this.chapter6and7Dao = chapter6and7Dao;
	}


	@Override
	public void populateBooks(List<Book> bookList) {
		// TODO Auto-generated method stub
		this.chapter6and7Dao.populateBooks(bookList);
	}


	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return this.chapter6and7Dao.getBooks();
	}

}
