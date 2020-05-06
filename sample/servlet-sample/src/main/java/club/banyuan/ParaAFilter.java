package club.banyuan;

import javax.servlet.*;
import java.io.IOException;

public class ParaAFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 参数处理
        String aStr = request.getParameter("a");
        if (aStr == null) {
            response.getWriter().println("you miss para a");
            return;
        }
        Integer a = null;
        try {
            a = Integer.valueOf(aStr);

        } catch (java.lang.NumberFormatException e) {
            response.getWriter().println("invalid para a " + e);
            return;
        }
        if (a == null) {
            response.getWriter().println("invalid para a");
            return;
        }
        chain.doFilter(request, response);
    }
}
