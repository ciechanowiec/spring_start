package eu.ciechanowiec.springstart.chapter5.ch5ex5.main;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;
import eu.ciechanowiec.springstart.chapter5.ch5ex5.ProjConfig;
import eu.ciechanowiec.springstart.chapter5.ch5ex5.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        CommentService commentServiceOne = context.getBean(CommentService.class);
        CommentService commentServiceTwo = context.getBean(CommentService.class);

        boolean sameServices = commentServiceOne == commentServiceTwo;
        System.out.println("Same services: " + sameServices);
    }
}
