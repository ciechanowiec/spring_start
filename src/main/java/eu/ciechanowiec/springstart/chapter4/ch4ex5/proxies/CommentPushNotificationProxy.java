package eu.ciechanowiec.springstart.chapter4.ch4ex5.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for a comment: "
                           + comment.getText());
    }
}
