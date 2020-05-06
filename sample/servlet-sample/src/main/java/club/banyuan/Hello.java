package club.banyuan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class Hello extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 发送邮件
        MailSender sender = (MailSender)getServletContext().getAttribute("mail-sender");
        sender.sendMail("abc@aaa.com");
        resp.getWriter().append("this is Hello servlet");
        resp.getWriter().append(
                getServletConfig().
                getServletContext().getInitParameter("ooo")
        );
    }
}
