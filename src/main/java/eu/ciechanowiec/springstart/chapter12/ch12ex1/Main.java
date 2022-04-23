package eu.ciechanowiec.springstart.chapter12.ch12ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Herman Ciechanowiec
 */
@SpringBootApplication
public class Main {

    /* To make this example work add the following
       dependency to pom.xml:
        <dependency>
          <groupId>com.h2database</groupId>
          <artifactId>h2</artifactId>
        </dependency>
    */

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
