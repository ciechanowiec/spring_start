package eu.ciechanowiec.springstart.chapter7.ch7ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class MainController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }
}
