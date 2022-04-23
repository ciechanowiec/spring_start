package eu.ciechanowiec.springstart.chapter3.ch3ex10;

/**
 * @author Herman Ciechanowiec
 */
public class Parrot {

    public String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
