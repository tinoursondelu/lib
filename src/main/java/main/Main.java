package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Author;
import models.Shelf;
import service.AuthorService;
import service.BookService;
import service.ShelfService;

public class Main {

	public static void main(String[] args) {
		
//		Création des différentes table
		
		
		System.out.println("> creation de la sessionFactory");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		
//		AuthorService as = new AuthorService();
//		ShelfService ss = new ShelfService();
//		BookService bs = new BookService();
//		for (int i = 0; i<1000; i++) {
//			System.out.println();
//			System.out.println("\t\t\t\t\t\t\t\t\t\t boucle n° ---> " + i + " <---");
//			System.out.println();
//			Author a = as.add("Guiot", "Olivier");
//			Shelf s = ss.add("Nature", "N23");
//			bs.add("Il était une fois" + i,
//					LocalDate.parse(("1921-07-22"),(DateTimeFormatter.ISO_LOCAL_DATE)),
//					"fleuve noir",
//					LocalDate.parse(("1921-07-22"),(DateTimeFormatter.ISO_LOCAL_DATE)),
//					a, s);
//		}
//		
		sf.close();
		System.out.println("> done");

	}

}
