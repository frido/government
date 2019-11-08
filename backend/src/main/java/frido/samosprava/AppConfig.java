package frido.samosprava;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import frido.samosprava.client.JdkHttpClient;
import frido.samosprava.client.WebClient;
import frido.samosprava.collection.InMemoryCollections;
import frido.samosprava.store.DataStore;
import frido.samosprava.store.HttpStore;

@Configuration
public class AppConfig {

  @Bean
  public WebClient webClient() {
    return new JdkHttpClient();
  }

  @Bean
  public DataStore dataStore() {
    // INFO: return new ClassPathStore();
    return new HttpStore(webClient(), "https://frido.github.io/government/db/");
  }

  @Bean
  public ObjectMapper objectMapper() {
    ObjectMapper MAPPER = new ObjectMapper();
    MAPPER.registerModule(new JSR310Module());
    MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    return MAPPER;
  }

  // @Bean
  // public InMemoryCollections inMemoryCollections() {
  // return new InMemoryCollections(dataStore());
  // }

  @Bean
  public InMemoryCollections inMemoryCollections2() {
    return new InMemoryCollections(dataStore());
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
      }
    };
  }
}
