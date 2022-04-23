package eu.ciechanowiec.springstart.chapter3.ch3ex7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        // Should throw an exception: circular dependency between Parrot and Person
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

    }
}
