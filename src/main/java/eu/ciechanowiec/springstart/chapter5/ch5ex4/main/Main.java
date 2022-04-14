package eu.ciechanowiec.springstart.chapter5.ch5ex4.main;

import eu.ciechanowiec.springstart.chapter5.ch5ex4.services.CommentService;
import eu.ciechanowiec.springstart.chapter5.ch5ex4.ProjConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        System.out.println("Before retrieving the CommentService");
        CommentService commentService = context.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
