package eu.ciechanowiec.springstart.chapter3.ch3ex9;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Person {

    private final String name = "Ella";

    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
