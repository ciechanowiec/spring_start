package eu.ciechanowiec.springstart.chapter6.ch6ex6.service;

import eu.ciechanowiec.springstart.chapter6.ch6ex6.aspect.ToLog;
import eu.ciechanowiec.springstart.chapter6.ch6ex6.model.Comment;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    @ToLog
    public String publishComment(Comment comment) {
        Logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }

    public void deleteComment(Comment comment) {
        Logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        Logger.info("Editing comment: " + comment.getText());
    }
}
