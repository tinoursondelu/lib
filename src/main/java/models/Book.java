package models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String subtitle;
    private LocalDate publicationDate;
    private String edition;
    private LocalDate editionDate;
    private LocalDate aadBD;
    private String reference;
    private String isbn;
    private boolean returned;
    private boolean stocked;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Shelf shelf;

/*------ GETTERS AND SETTERS ------*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

	public boolean isReturned() {
		return returned;
	}

	public void setReturned(boolean returned) {
		this.returned = returned;
	}

	public boolean isStocked() {
		return stocked;
	}

	public void setStocked(boolean stocked) {
		this.stocked = stocked;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public LocalDate getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(LocalDate editionDate) {
		this.editionDate = editionDate;
	}

	public LocalDate getAadBD() {
		return aadBD;
	}

	public void setAadBD(LocalDate aadBD) {
		this.aadBD = aadBD;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}
    
    
}
