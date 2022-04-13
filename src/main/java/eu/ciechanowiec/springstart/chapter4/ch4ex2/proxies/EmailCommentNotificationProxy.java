package eu.ciechanowiec.springstart.chapter4.ch4ex2.proxies;

import eu.ciechanowiec.springstart.chapter4.ch4ex2.model.Comment;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification fot comment: "
                           + comment.getText());
    }
}
