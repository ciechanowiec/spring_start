package eu.ciechanowiec.springstart.chapter6.ch6ex6;

import eu.ciechanowiec.springstart.chapter6.ch6ex6.aspect.LoggingAspect;
import eu.ciechanowiec.springstart.chapter6.ch6ex6.aspect.SecurityAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ProjConfig {

    @Bean
    LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}
