package eu.ciechanowiec.springstart.chapter2.ch2ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */

@Configuration
class ProjectConfig {

    @Bean
    Parrot parrot1() {
        return new Parrot("Koko");
    }

    @Bean
    Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean
    Parrot parrot3() {
        return new Parrot("Riki");
    }
}
