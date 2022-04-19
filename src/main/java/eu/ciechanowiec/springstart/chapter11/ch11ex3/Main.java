package eu.ciechanowiec.springstart.chapter11.ch11ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

/**
 * @author Herman Ciechanowiec
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
        app.run(args);
    }
}
