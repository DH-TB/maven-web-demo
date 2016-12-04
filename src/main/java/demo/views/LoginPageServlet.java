package demo.views;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginPageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response, HttpSession session)
            throws IOException, ServletException {
        String userName  = request.getParameter("userName");
        String password  = request.getParameter("password");

        if (userName!=null&&password!=null){
            if (userName.equals("admin")&&password.equals("123456")){
                session.setAttribute("userName",userName);
                session.setAttribute("password",password);

                request.getRequestDispatcher("/WEB-INF/pages/list.jsp").forward(request, response);
            }
        }

        request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
    }
}
