package eu.ciechanowiec.springstart.chapter4.ch4ex1.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex1.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex1.repositories.CommentRepository;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
