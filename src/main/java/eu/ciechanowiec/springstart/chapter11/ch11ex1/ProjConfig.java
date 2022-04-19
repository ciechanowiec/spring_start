package eu.ciechanowiec.springstart.chapter11.ch11ex1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
@EnableFeignClients(basePackages = "eu.ciechanowiec.springstart.chapter11.ch11ex1")
public class ProjConfig {
}
