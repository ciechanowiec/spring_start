package eu.ciechanowiec.springstart.chapter8.ch8ex2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class MainController {

    @RequestMapping("/home")
    String home(@RequestParam String color, Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "homech8ex2.html";
    }
}
