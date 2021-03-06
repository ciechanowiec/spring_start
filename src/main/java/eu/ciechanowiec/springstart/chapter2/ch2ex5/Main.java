package eu.ciechanowiec.springstart.chapter2.ch2ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrotPrimary = context.getBean(Parrot.class);
        System.out.println(parrotPrimary.name());
    }
}
