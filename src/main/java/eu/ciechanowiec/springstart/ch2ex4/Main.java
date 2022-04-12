package eu.ciechanowiec.springstart.ch2ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot2 = context.getBean("miki", Parrot.class);
        System.out.println(parrot2.name());
    }
}
