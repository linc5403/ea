package club.banyuan.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
         return "blog";
    // public void sayHello(HttpServletResponse resp) throws IOException {
    //    resp.getWriter().println("Hello, Spring!");
    }
}
