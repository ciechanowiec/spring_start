package eu.ciechanowiec.springstart.chapter4.ch4ex5.repositories;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentRepository {

    void storeComment(Comment comment);
}
