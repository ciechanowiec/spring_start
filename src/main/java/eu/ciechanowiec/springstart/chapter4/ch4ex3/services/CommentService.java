package eu.ciechanowiec.springstart.chapter4.ch4ex3.services;

import eu.ciechanowiec.springstart.chapter4.ch4ex3.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex3.proxies.CommentNotificationProxy;
import eu.ciechanowiec.springstart.chapter4.ch4ex3.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
