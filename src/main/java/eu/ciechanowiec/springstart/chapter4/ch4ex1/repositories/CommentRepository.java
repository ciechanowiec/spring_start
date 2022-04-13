package eu.ciechanowiec.springstart.chapter4.ch4ex1.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentRepository {

    void storeComment(Comment comment);
}
