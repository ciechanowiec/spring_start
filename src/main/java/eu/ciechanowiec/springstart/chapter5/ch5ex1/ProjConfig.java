package eu.ciechanowiec.springstart.chapter5.ch5ex1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
