package eu.ciechanowiec.springstart.chapter6.ch6ex1.services;

import eu.ciechanowiec.springstart.chapter6.ch6ex1.model.Comment;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    public void publishComment(Comment comment) {
        Logger.info("Publishing comment: " + comment.getText());
    }
}
