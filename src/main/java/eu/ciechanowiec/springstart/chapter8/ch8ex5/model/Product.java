package eu.ciechanowiec.springstart.chapter8.ch8ex5.model;

/**
 * @author Herman Ciechanowiec
 */
public class Product {

    private String name;
    private double price;

    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }
}
