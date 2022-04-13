package eu.ciechanowiec.springstart.chapter4.ch4ex6.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex6.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex6.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex6.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class AnotherService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public AnotherService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
