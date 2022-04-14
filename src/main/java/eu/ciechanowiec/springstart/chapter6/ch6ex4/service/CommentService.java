package eu.ciechanowiec.springstart.chapter6.ch6ex4.service;

import eu.ciechanowiec.springstart.chapter6.ch6ex4.aspect.ToLog;
import eu.ciechanowiec.springstart.chapter6.ch6ex4.model.Comment;
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

    @ToLog
    public void deleteComment(Comment comment) {
        Logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        Logger.info("Editing comment: " + comment.getText());
    }
}
