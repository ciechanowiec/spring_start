package eu.ciechanowiec.springstart.chapter5.ch5ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        CommentService commentService1 = context.getBean("commentService", CommentService.class);
        CommentService commentService2 = context.getBean("commentService", CommentService.class);

        boolean sameServices = commentService1 == commentService2;
        System.out.println("Same services: " + sameServices);
    }
}
