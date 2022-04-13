package eu.ciechanowiec.springstart.chapter3.ch3ex4;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Parrot {

    private String name = "Koko";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
