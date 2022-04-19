package eu.ciechanowiec.springstart.chapter11.ch11ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}
