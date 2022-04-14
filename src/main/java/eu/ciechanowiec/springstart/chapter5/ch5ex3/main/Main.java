package eu.ciechanowiec.springstart.chapter5.ch5ex3.main;

import eu.ciechanowiec.springstart.chapter5.ch5ex3.ProjConfig;
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
