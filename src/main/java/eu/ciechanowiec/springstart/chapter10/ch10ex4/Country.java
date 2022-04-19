package eu.ciechanowiec.springstart.chapter10.ch10ex4;

/**
 * @author Herman Ciechanowiec
 */
class Country {

    private String name;
    private int population;

    static Country of(String name, int population) {
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
