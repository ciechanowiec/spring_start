package eu.ciechanowiec.springstart.chapter3.ch3ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Person {

    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }
}
