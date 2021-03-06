package eu.ciechanowiec.springstart.chapter4.ch4ex1.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                           + comment.getText());
    }
}
