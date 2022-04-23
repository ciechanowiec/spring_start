package eu.ciechanowiec.springstart.chapter2.ch2ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    public Parrot parrot1() {
        return new Parrot("Koko");
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean
    public Parrot parrot3() {
        return new Parrot("Riki");
    }
}
