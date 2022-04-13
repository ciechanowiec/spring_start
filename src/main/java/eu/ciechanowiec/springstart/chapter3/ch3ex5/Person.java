package eu.ciechanowiec.springstart.chapter3.ch3ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Person {

    private String name = "Ella";
    private final Parrot parrot;

    @Autowired
    Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
