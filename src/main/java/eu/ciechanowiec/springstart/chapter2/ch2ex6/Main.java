package eu.ciechanowiec.springstart.chapter2.ch2ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot);
        System.out.println(parrot.getName());
    }
}
