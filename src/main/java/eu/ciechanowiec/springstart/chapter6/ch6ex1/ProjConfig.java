package eu.ciechanowiec.springstart.chapter6.ch6ex1;

import eu.ciechanowiec.springstart.chapter6.ch6ex1.services.CommentService;
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
class ProjConfig {
}
