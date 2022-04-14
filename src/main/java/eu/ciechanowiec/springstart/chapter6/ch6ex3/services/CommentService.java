package eu.ciechanowiec.springstart.chapter6.ch6ex3.services;

import eu.ciechanowiec.springstart.chapter6.ch6ex3.model.Comment;
import org.springframework.stereotype.Service;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    public String publishComment(Comment comment) {
        Logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
}
