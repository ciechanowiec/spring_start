package eu.ciechanowiec.springstart.chapter3.ch3ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());
        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
