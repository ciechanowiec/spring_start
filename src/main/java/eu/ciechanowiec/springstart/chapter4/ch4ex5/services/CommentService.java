package eu.ciechanowiec.springstart.chapter4.ch4ex5.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex5.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex5.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
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
