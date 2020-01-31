package dao;

import java.util.List;

import org.hibernate.Session;

import models.Book;
import utils.HibernateUtil;

public class BookDao extends GenericDao<Book> {

    public BookDao() {
        super(Book.class);
    }
    
	public List<Book> findByTitle(String title, Session s) {
		return (List<Book>) s.createQuery("from Book where title like :nom or subtitle like :nom")
				.setParameter("nom", "%"+ title +"%")
				.list();
	}
	
	public List<Book> findByTitle(String title) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Book> p = findByTitle(title, s);
		s.close();
		return p;
	}

}
