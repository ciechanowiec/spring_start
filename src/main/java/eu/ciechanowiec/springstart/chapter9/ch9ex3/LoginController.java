package eu.ciechanowiec.springstart.chapter9.ch9ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Herman Ciechanowiec
 */
@Controller
public class LoginController {

    @Autowired
    private LoginProcessor loginProcessor;

    @GetMapping("/")
    public String loginGet() {
        return "ch9ex2_login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                     @RequestParam String password,
                     Model model) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean loggedIn = loginProcessor.login();

        if (loggedIn) {
            return "redirect:/main";
        } else {
            model.addAttribute("message", "Login failed!");
            return "ch9ex3_login.html";
        }
    }
}
