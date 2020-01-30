package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Book;
import service.BookService;

@WebServlet("/bookDetail")
public class BookDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BookDetailServlet() {
        super();
    }
    
    BookService bookService = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("bookId")!=null && request.getParameter("bookId")!= "") {
			System.out.println(request.getParameter("bookId"));
			int id = Integer.parseInt(request.getParameter("bookId"));
			Book book = bookService.findById(id);
			request.setAttribute("book", book);
			System.out.println(book);
			request.getRequestDispatcher("WEB-INF/jsp/bookDetail.jsp").forward(request, response);
		} else {
			String error = "Book search failed";
			request.setAttribute("error", error);
			request.getRequestDispatcher("WEB-INF/jsp/accueil.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
