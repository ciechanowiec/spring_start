package eu.ciechanowiec.springstart.chapter4.ch4ex7.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex7.model.Comment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Herman Ciechanowiec
 */
@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing a comment: " + comment.getText());
    }
}
