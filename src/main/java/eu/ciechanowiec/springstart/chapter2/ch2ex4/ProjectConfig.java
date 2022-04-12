package eu.ciechanowiec.springstart.chapter2.ch2ex4;

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

    @Bean("miki") // Can be also (name = "miki") or (value = "miki")
    Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean
    Parrot parrot3() {
        return new Parrot("Riki");
    }
}
