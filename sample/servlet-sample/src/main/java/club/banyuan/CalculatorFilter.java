package club.banyuan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = {"/operator"})
public class CalculatorFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String a = request.getParameter("a");
        try {
            Integer va = Integer.valueOf(a);
        } catch (NumberFormatException e) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("参数a不正确");
            return;
        }
        String b = request.getParameter("b");
        try {
            Integer vb = Integer.valueOf(b);
        } catch (NumberFormatException e) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println("参数b不正确");
            return;
        }
        chain.doFilter(request, response);
    }
}
