package service;

import dao.ShelfDao;
import models.Shelf;

public class ShelfService {

    ShelfDao shelfDao = new ShelfDao();

    public Shelf add(String name, String section) {
        Shelf shelf = new Shelf();
        shelf.setName(name);
        shelf.setSection(section);
        shelfDao.create(shelf);
        return shelf;
    }
}
