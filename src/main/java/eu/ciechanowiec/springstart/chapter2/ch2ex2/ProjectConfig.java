package eu.ciechanowiec.springstart.chapter2.ch2ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */

@Configuration
class ProjectConfig {

    @Bean
    Parrot parrot() {
        return new Parrot("Koko");
    }

    @Bean
    String hello() {
        return "Hello!";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
