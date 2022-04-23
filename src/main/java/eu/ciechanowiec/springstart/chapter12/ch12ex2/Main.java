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
       3. Add the following content to the resources/application.properties:
           spring.datasource.url = jdbc:mysql://localhost/testdb
           spring.datasource.username = root
           spring.datasource.password = password
           spring.datasource.initialization-mode = always
       4. Add the following content to the resources/schema.sql:
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
