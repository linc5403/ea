package club.banyuan;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MailListener implements ServletContextListener {
    private Logger logger = Logger.getLogger(this.getClass());
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String mailAddr = sce.getServletContext().getInitParameter("mail-address");
        MailSender sender = new MailSender(mailAddr);
        sce.getServletContext().setAttribute("mail-sender", sender);
    }
}
