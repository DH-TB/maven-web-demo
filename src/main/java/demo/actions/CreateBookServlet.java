package demo.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import demo.models.Book;

public class CreateBookServlet extends HttpServlet {
    private static List<Book> books = new ArrayList<Book>();
    private int id=1;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        response.setCharacterEncoding("UTF-8");

        books.add(new Book(id, title, description));
        id++;
        response.sendRedirect("/");
    }


    public List<Book> getBooks(){
        return books;
    }
}
