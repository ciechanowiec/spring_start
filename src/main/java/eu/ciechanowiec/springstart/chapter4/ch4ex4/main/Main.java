package eu.ciechanowiec.springstart.chapter4.ch4ex4.main;

import eu.ciechanowiec.springstart.chapter4.ch4ex4.ProjConfig;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
