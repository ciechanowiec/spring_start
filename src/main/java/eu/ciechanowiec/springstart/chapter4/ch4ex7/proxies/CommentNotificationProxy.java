package eu.ciechanowiec.springstart.chapter4.ch4ex7.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex7.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
