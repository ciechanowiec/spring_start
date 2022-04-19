package eu.ciechanowiec.springstart.chapter8.ch8ex4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class MainController {

    @RequestMapping("/home/{color}")
    String home(@PathVariable String color,
                Model page) {
        page.addAttribute("color", color);
        page.addAttribute("username", "Katy");
        return "ch8ex4_home.html";
    }
}

