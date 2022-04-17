package eu.ciechanowiec.springstart.chapter8.ch8ex3;

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
    String home(@RequestParam(required = false) String color,
                @RequestParam(required = false) String username,
                Model page) {
        page.addAttribute("color", color);
        page.addAttribute("username", username);
        return "homech8ex3.html";
    }

}
