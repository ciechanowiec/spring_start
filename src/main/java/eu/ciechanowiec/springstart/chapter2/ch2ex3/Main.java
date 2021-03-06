package eu.ciechanowiec.springstart.chapter2.ch2ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot2 = context.getBean("parrot2", Parrot.class);
        System.out.println(parrot2.name());
    }
}
