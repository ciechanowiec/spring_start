package eu.ciechanowiec.springstart.chapter4.ch4ex4.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing a comment: " + comment.getText());
    }
}
