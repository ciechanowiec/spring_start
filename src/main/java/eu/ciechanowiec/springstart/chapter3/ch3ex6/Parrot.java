package eu.ciechanowiec.springstart.chapter3.ch3ex6;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Parrot {

    private String name = "Koko";

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
