package frido.samosprava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

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
            response.getOutputStream().write(getContent(fileName));
        } else {
            response.getOutputStream().write(getContent("index.html"));
        }
    }

    private File getFile(String name) {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource("static/" + name).getFile());
    }

    private byte[] getContent(String name) throws IOException {
        return Files.readAllBytes(getFile(name).toPath());
    }
}