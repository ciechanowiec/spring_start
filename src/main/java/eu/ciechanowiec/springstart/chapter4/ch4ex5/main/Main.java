package eu.ciechanowiec.springstart.chapter4.ch4ex5.main;

import eu.ciechanowiec.springstart.chapter4.ch4ex5.ProjConfig;
import eu.ciechanowiec.springstart.chapter4.ch4ex5.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex5.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

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
