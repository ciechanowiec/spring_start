package eu.ciechanowiec.springstart.chapter5.ch5ex5;

import eu.ciechanowiec.springstart.chapter5.ch5ex5.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
public class ProjConfig {

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    CommentService commentService() {
        return new CommentService();
    }
}
