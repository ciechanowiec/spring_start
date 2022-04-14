package eu.ciechanowiec.springstart.chapter4.ch4ex5.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;
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
