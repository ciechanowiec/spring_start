package eu.ciechanowiec.springstart.chapter12.ch12ex2;

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
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
        </dependency>
       2. Provide a MySQL database running with the following parameters:
           url = jdbc:mysql://localhost/testdb
           username = root
           password = password
    */

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
