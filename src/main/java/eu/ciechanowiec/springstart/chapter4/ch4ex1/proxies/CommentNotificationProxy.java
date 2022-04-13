package eu.ciechanowiec.springstart.chapter4.ch4ex1.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
