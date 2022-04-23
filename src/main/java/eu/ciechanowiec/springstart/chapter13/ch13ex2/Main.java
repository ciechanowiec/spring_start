package eu.ciechanowiec.springstart.chapter13.ch13ex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Herman Ciechanowiec
 */
@SpringBootApplication
public class Main {

    /* A. To make this example work:
        1. Add the following dependency to pom.xml:
            <dependency>
              <groupId>com.h2database</groupId>
              <artifactId>h2</artifactId>
              <scope>runtime</scope>
            </dependency>
        2. Add the following content to the resources/schema.sql:
            CREATE TABLE IF NOT EXISTS account (
                id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(50) NOT NULL,
                amount DOUBLE NOT NULL
            );
       B. According to the book (p. 313) names of the
          default customers are "Jane Down" and "John Read".
          In this application, however, different names are
          used (see resources/data.sql)
    */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
