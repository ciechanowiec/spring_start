package eu.ciechanowiec.springstart.ch2ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Herman Ciechanowiec
 */

@Configuration
class ProjectConfig {

    @Bean
    @Primary
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
