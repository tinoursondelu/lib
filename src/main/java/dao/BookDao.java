package dao;

import java.util.List;

import org.hibernate.Session;

import models.Book;
import utils.HibernateUtil;

public class BookDao extends GenericDao<Book> {

    public BookDao() {
        super(Book.class);
    }
    
	public List<Book> findByName(String nom, Session s) {
		return (List<Book>) s.createQuery("from Book where title like :nom")
				.setParameter("nom", "%"+nom+"%")
				.list();
	}
	
	public List<Book> findByName(String nom) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		List<Book> p = findByName(nom, s);
		s.close();
		return p;
	}

}
