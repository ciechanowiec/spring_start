package eu.ciechanowiec.springstart.chapter6.ch6ex2.main;

import eu.ciechanowiec.springstart.chapter6.ch6ex2.ProjConfig;
import eu.ciechanowiec.springstart.chapter6.ch6ex2.model.Comment;
import eu.ciechanowiec.springstart.chapter6.ch6ex2.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natalia");

        String value = commentService.publishComment(comment);

        Logger.info("Value caught: " + value);
    }
}
