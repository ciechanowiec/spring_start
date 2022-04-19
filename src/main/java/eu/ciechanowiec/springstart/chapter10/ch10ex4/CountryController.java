package eu.ciechanowiec.springstart.chapter10.ch10ex4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Herman Ciechanowiec
 */

@RestController
class CountryController {

    private final int francePopulation = 67;

    @GetMapping("/france")
    ResponseEntity<Country> france() {
        Country country = Country.of("France", francePopulation);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(country);
    }

}
