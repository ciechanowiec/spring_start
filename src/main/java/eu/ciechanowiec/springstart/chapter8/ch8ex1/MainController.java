package eu.ciechanowiec.springstart.chapter8.ch8ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model page) {
        page.addAttribute("username", "Katy");
        page.addAttribute("color", "red");
        ArrayList<String> arr = new ArrayList<>();
        return "home.html";
    }

}
