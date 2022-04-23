package eu.ciechanowiec.springstart.chapter5.ch5ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    @Autowired
    private ApplicationContext applicationContext;

    public void sendComment(Comment comment) {
        CommentProcessor commentProcessor =
                applicationContext.getBean(CommentProcessor.class);

        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);
        Comment changedComment = commentProcessor.getComment();
    }
}
