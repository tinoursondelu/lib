package service;

import java.util.List;

import dao.AuthorDao;
import models.Author;

public class AuthorService {

    AuthorDao authorDao = new AuthorDao();

    public Author add(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        authorDao.create(author);
        return author;
    }

    public Author findById(int id) {
        return authorDao.findById(id);
    }

    public List<Author> findAll() {
        return authorDao.findAll();
    }
}
