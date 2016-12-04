package demo.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private String message = "Invalid username or password";

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName  = request.getParameter("userName");
        String password  = request.getParameter("password");

        if (userName!=null&&password!=null){
            if (userName.equals("admin")&&password.equals("123456")){
                request.getSession().setAttribute("userName",userName);
                response.sendRedirect("/");
            }
            else {
                request.getSession().setAttribute("message",message);
                response.sendRedirect("/login");
            }
        }
    }
}
