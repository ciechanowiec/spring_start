package eu.ciechanowiec.springstart.chapter3.ch3ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        Person person = context.getBean(Person.class);

        System.out.println("Parrot's name: " + parrot.getName());
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot name: " + person.getParrot());

    }
}
