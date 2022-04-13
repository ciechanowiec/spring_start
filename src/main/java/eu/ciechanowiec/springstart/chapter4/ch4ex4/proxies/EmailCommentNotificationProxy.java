package eu.ciechanowiec.springstart.chapter4.ch4ex4.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.model.Comment;

/**
 * @author Herman Ciechanowiec
 */
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                           + comment.getText());
    }
}
