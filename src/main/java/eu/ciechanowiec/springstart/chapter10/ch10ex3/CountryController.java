package eu.ciechanowiec.springstart.chapter10.ch10ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Herman Ciechanowiec
 */
@RestController
class CountryController {

    private final int FRANCE_POPULATION = 67;
    private final int SPAIN_POPULATION = 47;

    @GetMapping("/france")
    Country france() {
        return Country.of("France", FRANCE_POPULATION);
    }

    @GetMapping("/all")
    List<Country> countries() {
        Country france = Country.of("France", FRANCE_POPULATION);
        Country spain = Country.of("Spain", SPAIN_POPULATION);
        return List.of(france, spain);
    }
}
