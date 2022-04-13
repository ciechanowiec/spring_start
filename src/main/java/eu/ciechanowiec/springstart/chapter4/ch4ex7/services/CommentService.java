package eu.ciechanowiec.springstart.chapter4.ch4ex7.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex7.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex7.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex7.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
