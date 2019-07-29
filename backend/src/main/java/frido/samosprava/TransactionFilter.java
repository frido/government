package frido.samosprava;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

@Component
public class TransactionFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    HttpServletRequest req = (HttpServletRequest) request;
    String link = req.getRequestURI();
    if (link.startsWith("/api")) {
      chain.doFilter(request, response);
    } else if (link.endsWith(".js") || link.endsWith(".ico") || link.endsWith(".css") || link.endsWith(".png")
        || link.endsWith(".jpg") || link.endsWith(".woff2") || link.endsWith(".woff") || link.endsWith(".ttf")
        || link.endsWith(".svg")) {
      String fileName = link.substring(link.lastIndexOf("/"));
      if (link.endsWith(".js")) {
        response.setContentType("text/javascript");
      }
      if (link.endsWith(".css")) {
        response.setContentType("text/css");
      }
      response.getOutputStream().write(getContent(fileName));
    } else {
      response.getOutputStream().write(getContent("/index.html"));
    }
  }

  private byte[] getContent(String name) throws IOException {
    ClassPathResource cpr = new ClassPathResource("static" + name);
    return FileCopyUtils.copyToByteArray(cpr.getInputStream());
  }
}
