package frido.samosprava;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;

@Configuration
public class AppConfig {

    @Bean
    public WebClient webClient() throws IOException {
        return new JdkHttpClient();
    }
    
    @Bean
    public DataStore dataStore() throws IOException {
        //return new ClassPathStore();
    	return new HttpStore(webClient());
    }
    
    @Bean
    public InMemoryCollections inMemoryCollections() throws IOException {
    	InMemoryCollections collections = new InMemoryCollections(dataStore(), "https://frido.github.io/government/db/");
        return collections;
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
            }
        };
    }
}