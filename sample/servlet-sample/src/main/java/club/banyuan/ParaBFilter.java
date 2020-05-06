package club.banyuan;

import javax.servlet.*;
import java.io.IOException;

public class ParaBFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 参数处理
        String aStr = request.getParameter("b");
        if (aStr == null) {
            response.getWriter().println("you miss para b");
            return;
        }
        Integer b = null;
        try {
            b = Integer.valueOf(aStr);

        } catch (NumberFormatException e) {
            response.getWriter().println("invalid para b " + e);
            return;
        }
        if (b == null) {
            response.getWriter().println("invalid para b");
            return;
        }
        chain.doFilter(request, response);
    }
}
