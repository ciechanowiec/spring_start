package eu.ciechanowiec.springstart.chapter6.ch6ex1;

import eu.ciechanowiec.springstart.chapter6.ch6ex1.model.Comment;
import eu.ciechanowiec.springstart.chapter6.ch6ex1.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        comment.setText("Natalia");

        commentService.publishComment(comment);
    }
}
