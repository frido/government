package frido.samosprava;

import frido.samosprava.core.client.JdkHttpClient;
import frido.samosprava.core.client.WebClient;
import frido.samosprava.core.collection.InMemoryCollections;
import frido.samosprava.core.store.DataStore;
import frido.samosprava.core.store.HttpStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;

@Configuration
public class AppConfig {

    @Bean
    public WebClient webClient() {
        return new JdkHttpClient();
    }
    
    @Bean
    public DataStore dataStore() {
        //INFO: return new ClassPathStore();
    	return new HttpStore(webClient(), "https://frido.github.io/government/db/");
    }
    
    @Bean
    public InMemoryCollections inMemoryCollections() {
        return new InMemoryCollections(dataStore());
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
            }
        };
    }
}