package service.ch4;

import java.util.List;

import dao.ch4.Chapter4Dao;

import sample.entity.AudioDisc;
import sample.entity.Book;
import sample.entity.VideoDisc;




public class Chapter4ServiceImpl implements Chapter4Service{

	private Chapter4Dao chapter4DAO;

	public Chapter4Dao getChapter4DAO() {
		return chapter4DAO;
	}

	public void setChapter4DAO(Chapter4Dao chapter4dao) {
		chapter4DAO = chapter4dao;
	}

	@Override
	public void getDiscs() {
		// TODO Auto-generated method stub
		this.chapter4DAO.getDiscs();
	}

	@Override
	public void populateAudioDiscs(List<AudioDisc> audioDiscList) {
		// TODO Auto-generated method stub
		this.chapter4DAO.populateAudioDiscs(audioDiscList);
	}

	@Override
	public void populateVideoDiscs(List<VideoDisc> videoDiscList) {
		// TODO Auto-generated method stub
		this.chapter4DAO.populateVideoDisc(videoDiscList);
	}

	@Override
	public void populateBooks(List<Book> bookList) {
		// TODO Auto-generated method stub
		this.chapter4DAO.populateBooks(bookList);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return this.chapter4DAO.getBooks();
	}
}
