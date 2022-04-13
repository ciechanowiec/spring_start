package eu.ciechanowiec.springstart.chapter4.ch4ex7.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex7.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                           + comment.getText());
    }
}
