package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Author;
import models.Shelf;
import service.AuthorService;
import service.BookService;
import service.ShelfService;

@WebServlet("/bookAdd")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddBookServlet() {
        super();
    }
    
    BookService bookService = new BookService();
    AuthorService authorService = new AuthorService();
    ShelfService shelfService = new ShelfService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/jsp/bookAdd.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Author a = new Author();
		if (request.getParameter("authorLastName").isBlank() || 
				request.getParameter("authorFirstName").isBlank()) {
			a = authorService.add("not specified", "not specified");
		} else {
			a = authorService.add(request.getParameter("authorLastName"),
					request.getParameter("authorFirstName"));
		}
		
		Shelf s = new Shelf();
		if (request.getParameter("shelfRef").isBlank() || 
				request.getParameter("shelfSection").isBlank()) {
			s = shelfService.add("not specified", "not specified");
		} else {
			s = shelfService.add(request.getParameter("shelfRef"),
					request.getParameter("shelfSection"));
		}
		
		bookService.add(request.getParameter("name"), a, s);
		
		response.sendRedirect(response.encodeRedirectURL(request.getContextPath()));
	}

}
