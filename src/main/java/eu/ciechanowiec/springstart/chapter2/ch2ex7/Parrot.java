package eu.ciechanowiec.springstart.chapter2.ch2ex7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
