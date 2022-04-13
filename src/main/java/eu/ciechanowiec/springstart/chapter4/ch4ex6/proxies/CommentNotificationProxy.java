package eu.ciechanowiec.springstart.chapter4.ch4ex6.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex6.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
