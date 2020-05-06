package club.banyuan;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class DogListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String breed = sce.getServletContext().getInitParameter("breed");
        Dog dog = new Dog();
        dog.setBreed(breed);
        sce.getServletContext().setAttribute("dog", dog);
    }
}
