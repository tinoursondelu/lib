package service;

import dao.LibraryDao;
import models.Library;

public class LibraryService {

    LibraryDao libraryDao = new LibraryDao();

    public void add(String name) {
        Library library = new Library();
        library.setName(name);
        libraryDao.create(library);
    }


}
