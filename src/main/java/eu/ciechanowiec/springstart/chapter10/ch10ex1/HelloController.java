package eu.ciechanowiec.springstart.chapter10.ch10ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Herman Ciechanowiec
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello!";
    }

    @RequestMapping("/ciao")
    @ResponseBody
    public String ciao() {
        return "Ciao!";
    }
}
