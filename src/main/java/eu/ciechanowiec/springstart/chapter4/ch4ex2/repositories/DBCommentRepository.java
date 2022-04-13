package eu.ciechanowiec.springstart.chapter4.ch4ex2.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex2.model.Comment;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing a comment: " + comment.getText());
    }
}
