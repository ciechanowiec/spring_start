package eu.ciechanowiec.springstart.chapter10.ch10ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Herman Ciechanowiec
 */
@RestController
public class CountryController {

    private final int francePopulation = 67;
    private final int spainPopulation = 47;

    @GetMapping("/france")
    public Country france() {
        return Country.of("France", francePopulation);
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country france = Country.of("France", francePopulation);
        Country spain = Country.of("Spain", spainPopulation);
        return List.of(france, spain);
    }
}
