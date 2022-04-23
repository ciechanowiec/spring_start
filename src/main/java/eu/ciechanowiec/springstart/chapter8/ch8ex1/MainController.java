package eu.ciechanowiec.springstart.chapter8.ch8ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        return "ch8ex1_home.html";
    }
}
