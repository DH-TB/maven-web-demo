package demo.filter;

import javax.servlet.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class LoginCheckFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponse response1 = (HttpServletResponse)response;
        HttpServletRequest request1 = (HttpServletRequest)request;
        HttpSession session = request1.getSession();

        if (session.getAttribute("userName") != null) {
            filterChain.doFilter(request, response);
        }
        else {
            response1.sendRedirect("/login");
        }
    }

    public void destroy() {
    }
}

