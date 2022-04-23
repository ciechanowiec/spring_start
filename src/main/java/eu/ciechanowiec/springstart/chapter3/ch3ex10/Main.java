package eu.ciechanowiec.springstart.chapter3.ch3ex10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
