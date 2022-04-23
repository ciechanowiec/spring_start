package eu.ciechanowiec.springstart.appendixB;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        Parrot parrot = context.getBean(Parrot.class);

        System.out.println(parrot.getName());
    }
}
