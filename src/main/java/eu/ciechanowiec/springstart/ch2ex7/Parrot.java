package eu.ciechanowiec.springstart.ch2ex7;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Herman Ciechanowiec
 */
@Component
class Parrot {

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
