package eu.ciechanowiec.springstart.chapter3.ch3ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Person {

    private String name = "Ella";
    private Parrot parrot;

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
