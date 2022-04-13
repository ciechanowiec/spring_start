package eu.ciechanowiec.springstart.chapter3.ch3ex8;

/**
 * @author Herman Ciechanowiec
 */
class Parrot {

    public String name;

    Parrot() {
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
