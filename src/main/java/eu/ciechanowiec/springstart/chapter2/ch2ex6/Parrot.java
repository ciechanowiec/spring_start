package eu.ciechanowiec.springstart.chapter2.ch2ex6;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Parrot {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
