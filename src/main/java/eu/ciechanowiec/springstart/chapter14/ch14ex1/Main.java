package eu.ciechanowiec.springstart.chapter14.ch14ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Herman Ciechanowiec
 */
@SpringBootApplication
public class Main {

    /* To make this example work:
        1. Add the following dependency to pom.xml:
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-data-jdbc</artifactId>
            </dependency>
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
    */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
