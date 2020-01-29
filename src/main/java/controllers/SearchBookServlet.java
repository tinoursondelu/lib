package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Book;
import service.BookService;

@WebServlet("/bookSearch")
public class SearchBookServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public SearchBookServlet() {
        super();
    }
    
    BookService bookService = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books = bookService.findByName("");
		request.setAttribute("books", books);
		for (Book book : books) {
			System.out.println(book);
		}
		request.getRequestDispatcher("WEB-INF/jsp/bookSearch.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
