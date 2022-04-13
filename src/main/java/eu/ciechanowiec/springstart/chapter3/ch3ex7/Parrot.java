package eu.ciechanowiec.springstart.chapter3.ch3ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Parrot {

    private final Person person;

    @Autowired
    Parrot(Person person) {
        this.person = person;
    }
}
