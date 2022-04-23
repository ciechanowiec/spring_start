package eu.ciechanowiec.springstart.chapter3.ch3ex10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
@ComponentScan
public class ProjConfig {

    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }
}
