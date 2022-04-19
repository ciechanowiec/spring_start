package eu.ciechanowiec.springstart.chapter6.ch6ex4.main;

import eu.ciechanowiec.springstart.chapter6.ch6ex4.ProjConfig;
import eu.ciechanowiec.springstart.chapter6.ch6ex4.model.Comment;
import eu.ciechanowiec.springstart.chapter6.ch6ex4.service.CommentService;
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
        comment.setAuthor("Natalia");

        commentService.publishComment(comment);
        commentService.deleteComment(comment);
        commentService.editComment(comment);
    }
}
