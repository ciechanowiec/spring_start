package eu.ciechanowiec.springstart.chapter10.ch10ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Herman Ciechanowiec
 */
@Controller
class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello!";
    }

    @RequestMapping("/ciao")
    @ResponseBody
    String ciao() {
        return "Ciao!";
    }
}
