package eu.ciechanowiec.springstart.chapter4.ch4ex6.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex6.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Qualifier("PUSH")
class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for a comment: "
                           + comment.getText());
    }
}
