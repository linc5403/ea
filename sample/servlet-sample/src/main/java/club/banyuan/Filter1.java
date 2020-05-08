package club.banyuan;


import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String filter1Req = request.getParameter("p1");
        if (filter1Req == null) {
            response.getWriter().println("You must commit parameter p1");
        } else {
            chain.doFilter(request, response);
        }
    }
}
