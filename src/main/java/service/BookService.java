package service;

import java.util.List;

import dao.BookDao;
import models.Author;
import models.Book;
import models.Shelf;

public class BookService {

    BookDao bookDao = new BookDao();

    public void add(String title, Author author, Shelf shelf) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setShelf(shelf);
        bookDao.create(book);
    }

    public Book findById(int id) {
        return bookDao.findById(id);
    }
    
    public List<Book> findByName(String nom) {
		return bookDao.findByName(nom);
	}

    public List<Book> findAll() {
        return bookDao.findAll();
    }


}
