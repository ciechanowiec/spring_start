package eu.ciechanowiec.springstart.chapter6.ch6ex5.main;

import eu.ciechanowiec.springstart.chapter6.ch6ex5.ProjConfig;
import eu.ciechanowiec.springstart.chapter6.ch6ex5.model.Comment;
import eu.ciechanowiec.springstart.chapter6.ch6ex5.service.CommentService;
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
