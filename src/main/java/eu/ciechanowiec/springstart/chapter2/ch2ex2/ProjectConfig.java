package eu.ciechanowiec.springstart.chapter2.ch2ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        return new Parrot("Koko");
    }

    @Bean
    public String hello() {
        return "Hello!";
    }

    @Bean
    public Integer ten() {
        return 10;
    }
}
