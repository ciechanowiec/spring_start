package eu.ciechanowiec.springstart.chapter10.ch10ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Herman Ciechanowiec
 */
@RestController
class HelloController {

    @GetMapping("/hello")
    String hello() {
        return "Hello!";
    }

    @GetMapping("/ciao")
    String ciao() {
        return "Ciao!";
    }
}
