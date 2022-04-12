package eu.ciechanowiec.springstart.chapter2.ch2ex6;

import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Parrot {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
