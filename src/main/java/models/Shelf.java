package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Shelf {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String section;
    @OneToMany(mappedBy="shelf")
    private List<Book> shelfBooks;
    @ManyToOne
    private Library library;

    /*------ GETTERS AND SETTERS ------*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public List<Book> getShelfBooks() {
        return shelfBooks;
    }

    public void setShelfBooks(List<Book> shelfBooks) {
        this.shelfBooks = shelfBooks;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

	@Override
	public String toString() {
		return "Shelf [id=" + id + ", name=" + name + ", section=" + section + "]";
	}
    
    
}
