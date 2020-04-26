package club.banyuan;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContext;

public class DogListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();
        String breed = context.getInitParameter("breed");
        Dog dog = new Dog(breed);
        context.setAttribute("dog", dog);
    }
}
