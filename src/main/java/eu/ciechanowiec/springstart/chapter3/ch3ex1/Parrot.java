package eu.ciechanowiec.springstart.chapter3.ch3ex1;

/**
 * @author Herman Ciechanowiec
 */
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
