package eu.ciechanowiec.springstart.chapter3.ch3ex5;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Parrot {

    private String name = "Koko";

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}