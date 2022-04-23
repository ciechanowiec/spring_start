package eu.ciechanowiec.springstart.chapter12.ch12ex3;

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
       3. Add the following content to the resources/application.properties:
           custom.datasource.url = jdbc:mysql://localhost/testdb
           custom.datasource.username = root
           custom.datasource.password = password
           spring.datasource.initialization-mode = always
    */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
