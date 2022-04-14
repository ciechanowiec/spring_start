package eu.ciechanowiec.springstart.chapter5.ch5ex3.main;

import eu.ciechanowiec.springstart.chapter4.ch4ex1.model.Comment;
import eu.ciechanowiec.springstart.chapter5.ch5ex3.ProjConfig;
import eu.ciechanowiec.springstart.chapter5.ch5ex2.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);
    }
}
