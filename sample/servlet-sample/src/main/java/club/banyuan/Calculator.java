package club.banyuan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/operator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MailSender sender = (MailSender)getServletContext().getAttribute("mail-sender");
        Integer a = Integer.valueOf( req.getParameter("a") );
        Integer b = Integer.valueOf( req.getParameter("b") );
        Integer c = a + b;
        req.setAttribute("result", c);
        req.setAttribute("name", "zhangsan");
        req.getRequestDispatcher("time.jsp").forward(req, resp);
    }
}
