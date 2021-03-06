package club.banyuan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operator1", urlPatterns = {"/operator1"}, initParams = @WebInitParam(name = "aaa", value = "abc"))
public class CalAdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletConfig().getInitParameter("name");
        Integer a = Integer.valueOf( req.getParameter("a") );
        Integer b = Integer.valueOf( req.getParameter("b") );
        Integer c = a + b;
        req.setAttribute("result", c);
        RequestDispatcher  dispatcher = req.getRequestDispatcher("add.jsp");
        dispatcher.forward(req, resp);
    }
}
