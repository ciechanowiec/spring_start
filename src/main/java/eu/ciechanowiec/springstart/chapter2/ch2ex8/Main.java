package eu.ciechanowiec.springstart.chapter2.ch2ex8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = new Parrot(); // Instance to add to the context
        parrot.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> parrot; // Supplier to return the instance
        context.registerBean("parrot1",
                Parrot.class, parrotSupplier); // Add instance to the context

        Parrot parrotFromContext = context.getBean(Parrot.class);
        System.out.println(parrotFromContext.getName());
    }

}
