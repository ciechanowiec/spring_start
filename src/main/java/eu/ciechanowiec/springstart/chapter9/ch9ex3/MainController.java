package eu.ciechanowiec.springstart.chapter9.ch9ex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    @Autowired
    MainController(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    String home(@RequestParam(required = false) String logout,
                       Model model) {
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();

        if (username == null) {
            return "redirect:/";
        }

        model.addAttribute("username", username);
        model.addAttribute("loginCount", count);

        return "ch9ex3_main.html";
    }
}
