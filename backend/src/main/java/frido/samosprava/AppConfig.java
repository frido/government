package frido.samosprava;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import frido.samosprava.budget.BudgetService;
import frido.samosprava.persons.PersonService;
import frido.samosprava.resolutions.ResolutionService;

@Configuration
public class AppConfig {

    @Bean
    public ResolutionService uzneseniaService() throws IOException {
        ResolutionService service = new ResolutionService();
        service.load();
        return service;
    }

    @Bean
    public PersonService personService() throws IOException {
        PersonService service = new PersonService();
        service.load();
        return service;
    }

    @Bean
    public BudgetService budgetService() throws IOException {
        BudgetService service = new BudgetService();
        service.load();
        return service;
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