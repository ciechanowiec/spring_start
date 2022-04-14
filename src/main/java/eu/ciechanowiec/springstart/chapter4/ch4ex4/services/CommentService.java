package eu.ciechanowiec.springstart.chapter4.ch4ex4.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.repositories.CommentRepository;

/**
 * @author Herman Ciechanowiec
 */
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
