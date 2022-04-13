package eu.ciechanowiec.springstart.chapter4.ch4ex2.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex2.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentRepository {

    void storeComment(Comment comment);
}
