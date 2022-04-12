package eu.ciechanowiec.springstart.chapter3.ch3ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */

@Configuration
class ProjConfig {

    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    Person person() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }
}
