package eu.ciechanowiec.springstart.chapter3.ch3ex8;

import org.springframework.beans.factory.annotation.Qualifier;
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

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot);
        return person;
    }
}
