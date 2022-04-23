package eu.ciechanowiec.springstart.chapter12.ch12ex1;

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
          <groupId>com.h2database</groupId>
          <artifactId>h2</artifactId>
        </dependency>
     2. Add the following content to the resources/schema.sql:
         CREATE TABLE IF NOT EXISTS purchase (
              id INT AUTO_INCREMENT PRIMARY KEY,
              product varchar(50) NOT NULL,
              price double NOT NULL
          );
    */

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
