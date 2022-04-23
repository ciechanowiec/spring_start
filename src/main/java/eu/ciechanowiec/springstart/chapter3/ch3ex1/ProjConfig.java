package eu.ciechanowiec.springstart.chapter3.ch3ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjConfig {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Ella");
        return person;
    }
}
