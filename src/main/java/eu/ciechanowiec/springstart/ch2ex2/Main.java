package eu.ciechanowiec.springstart.ch2ex2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        String hello = context.getBean(String.class);
        Integer ten = context.getBean(Integer.class);

        System.out.println(parrot.name());
        System.out.println(hello);
        System.out.println(ten);
    }
}		
