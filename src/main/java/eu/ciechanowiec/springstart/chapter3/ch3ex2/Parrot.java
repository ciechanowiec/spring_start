package eu.ciechanowiec.springstart.chapter3.ch3ex2;

/**
 * @author Herman Ciechanowiec
 */
class Parrot {

    private String name;

    Parrot() {
        System.out.println("Parrot created");
    }

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
