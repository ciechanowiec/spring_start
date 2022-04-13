package eu.ciechanowiec.springstart.chapter4.ch4ex4.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
