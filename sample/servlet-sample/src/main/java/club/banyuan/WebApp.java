package club.banyuan;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class WebApp extends HttpServlet {
    private Integer vote;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        vote++;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Date now = new Date();
        // now -> time.jsp
        /*
        PrintWriter out = resp.getWriter();
        out.println("<html>" +
        "<body>" +
        "The current time is " +
        "always 4:20 PM" +
        "on the server" +
        "</body>" +
        "</html>");
         */
    }
}
