package thread_safety.servlet;

import net.jcip.annotations.ThreadSafe;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

@ThreadSafe
public class StatelessFactorizer implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        BigInteger i = extractFromRequest(req);
        BigInteger[] factors = factor(i);

        encodeIntoResponse(res, factors);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    private void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

    private BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("7");
    }

    private BigInteger[] factor(BigInteger i) {
        // Doesn't really factor
        return new BigInteger[]{i};
    }
}
