package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtil;

public class GenericDao <T> {

    private Class<T> clazz;

    public GenericDao(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    
    public void create(T o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        create(o, s);
        s.close();
    }

    public void create(T o, Session s) {
        s.beginTransaction();
        try {
            create(o, s, s.getTransaction());
            s.getTransaction().commit();
        } catch (HibernateException e) {
            s.getTransaction().rollback();
            throw e;
        }
    }

    public void create(T o, Session s, Transaction t) {
        s.saveOrUpdate(o);
    }

    public void remove(T o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        remove(o);
        s.close();
    }

    public void remove(T o, Session s) {
        s.beginTransaction();
        try {
            remove(o, s, s.getTransaction());
            s.getTransaction().commit();
        } catch (HibernateException e) {
            s.getTransaction().rollback();
            throw e;
        }
    }

    public void remove(T o, Session s, Transaction t) {
        s.delete(o);
    }

    public void merge(T o) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        merge(o, s);
        s.close();
    }

    public void merge(T o, Session s) {
        s.beginTransaction();
        try {
            merge(o, s, s.getTransaction());
            s.getTransaction().commit();
        } catch (HibernateException e) {
            s.getTransaction().rollback();
            throw e;
        }
    }

    public void merge(T o, Session s, Transaction t) {
        s.merge(o);
    }

    public T findById(int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        T o = findById(id, s);
        s.close();
        return o;
    }

    public T findById(int id, Session s) {
        return s.get(clazz, id);
    }

    public List<T> findAll() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<T> lo = findAll(s);
        s.close();
        return lo;
    }

    public List<T> findAll(Session s) {
        return s.createQuery("from " + clazz.getName()).list();

    }
}



