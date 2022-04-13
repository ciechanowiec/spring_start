package eu.ciechanowiec.springstart.chapter4.ch4ex6.main;

import eu.ciechanowiec.springstart.chapter4.ch4ex6.ProjConfig;
import eu.ciechanowiec.springstart.chapter4.ch4ex6.model.Comment;
import eu.ciechanowiec.springstart.chapter4.ch4ex6.services.AnotherService;
import eu.ciechanowiec.springstart.chapter4.ch4ex6.services.CommentService;
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
        System.out.println();
        AnotherService anotherService = context.getBean(AnotherService.class);
        anotherService.publishComment(comment);
    }
}
