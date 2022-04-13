package eu.ciechanowiec.springstart.chapter4.ch4ex5.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
