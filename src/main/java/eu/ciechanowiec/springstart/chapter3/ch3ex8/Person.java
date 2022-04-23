package eu.ciechanowiec.springstart.chapter3.ch3ex8;

/**
 * @author Herman Ciechanowiec
 */
public class Person {

    private String name;

    private Parrot parrot;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
