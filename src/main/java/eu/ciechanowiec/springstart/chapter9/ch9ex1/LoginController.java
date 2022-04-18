package eu.ciechanowiec.springstart.chapter9.ch9ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class LoginController {

    @GetMapping("/")
    String loginGet() {
        return "loginch9ex1.html";
    }

    @PostMapping("/")
    String loginPost(@RequestParam String username,
                     @RequestParam String password,
                     Model model) {
        boolean loggedIn = false;

        if (loggedIn) {
            model.addAttribute("message", "You are now logged in.");
        } else {
            model.addAttribute("message", "Login failed!");
        }

        return "loginch9ex1.html";
    }
}
