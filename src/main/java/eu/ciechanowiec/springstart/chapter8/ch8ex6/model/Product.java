package eu.ciechanowiec.springstart.chapter8.ch8ex6.model;

/**
 * @author Herman Ciechanowiec
 */
public class Product {

    public String name;
    public double price;

    public String name() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double price() {
        return price;
    }
}
