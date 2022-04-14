package eu.ciechanowiec.springstart.chapter4.ch4ex4;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.proxies.EmailCommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.repositories.CommentRepository;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.repositories.DBCommentRepository;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Herman Ciechanowiec
 */
@Configuration
@ComponentScan
public class ProjConfig {

    @Bean
    EmailCommentNotificationProxy emailCommentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    DBCommentRepository dbCommentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    CommentService commentService(CommentRepository commentRepository,
                                  CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}