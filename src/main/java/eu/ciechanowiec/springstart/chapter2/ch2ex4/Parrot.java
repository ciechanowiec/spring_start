package eu.ciechanowiec.springstart.chapter2.ch2ex4;

/**
 * @author Herman Ciechanowiec
 */
class Parrot {

    private final String name;

    Parrot(String name) {
        this.name = name;
    }

    String name() {
        return name;
    }
}