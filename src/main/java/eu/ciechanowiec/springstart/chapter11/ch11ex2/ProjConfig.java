package eu.ciechanowiec.springstart.chapter11.ch11ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
