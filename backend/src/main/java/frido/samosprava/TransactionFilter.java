package frido.samosprava;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

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
            if(link.endsWith(".js")) {
            	response.setContentType("text/javascript");
            }
            if(link.endsWith(".css")) {
            	response.setContentType("text/css");
            }
            response.getOutputStream().write(getContent(fileName));
        } else {
            response.getOutputStream().write(getContent("/index.html"));
        }
    }

    private byte[] getContent(String name) throws IOException {
        ClassPathResource cpr = new ClassPathResource("static" + name);
        byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
        //String content = new String(bdata, StandardCharsets.UTF_8);
        return bdata;
    }
}