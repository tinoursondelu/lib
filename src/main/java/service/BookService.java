package service;

import java.time.LocalDate;
import java.util.List;

import dao.BookDao;
import models.Author;
import models.Book;
import models.Shelf;

public class BookService {

	BookDao bookDao = new BookDao();

	public void add(String title, String subtitle, LocalDate publicationDate, String edition, LocalDate editionDate,
			Author author, Shelf shelf, String isbn) {
		Book book = new Book();
		book.setTitle(title);
		book.setSubtitle(subtitle);
		book.setPublicationDate(publicationDate);
		book.setEdition(edition);
		book.setEditionDate(editionDate);
		book.setAadBD(LocalDate.now());
		book.setAuthor(author);
		book.setShelf(shelf);
		book.setReturned(true);
		book.setStocked(true);
		book.setIsbn(isbn);
		bookDao.create(book);
		book.setReference(createRef(book.getId(), shelf.getName(), 
				shelf.getSection(), book.getPublicationDate()));
		bookDao.merge(book);
	}

	public Book findById(int id) {
		return bookDao.findById(id);
	}

	public List<Book> findAll() {
		return bookDao.findAll();
	}

	public List<Book> findByTitle(String title) {
		return bookDao.findByTitle(title);
	}
	
	public void borrowing(int id) {
		Book book = bookDao.findById(id);
		book.setReturned(false);
		book.setStocked(false);
		bookDao.merge(book);
		System.out.println("Book " + book.getTitle() + " go away");
	}

	public void returned(int id) {
		Book book = bookDao.findById(id);
		book.setReturned(true);
		bookDao.merge(book);
		System.out.println("Book " + book.getTitle() + " is back");
	}
	
	public void stocked(int id) {
		Book book = bookDao.findById(id);
		book.setStocked(true);
		bookDao.merge(book);
		System.out.println("Book " + book.getTitle() + " is in his place");
	}
	
	public String createRef(int id, String shlefName, String section, LocalDate publicationDate) {
		String first = String.valueOf(id);
		char two = shlefName.charAt(0);
		char three = section.charAt(0);
		String last = publicationDate.toString().substring(2, 4);
		System.out.println(first + two + three + last);
		
		return (first + two + three + last);
	}


}
