package eu.ciechanowiec.springstart.chapter5.ch5ex6.main;

import eu.ciechanowiec.springstart.chapter5.ch5ex6.ProjConfig;
import eu.ciechanowiec.springstart.chapter5.ch5ex6.repositories.CommentRepository;
import eu.ciechanowiec.springstart.chapter5.ch5ex6.services.CommentService;
import eu.ciechanowiec.springstart.chapter5.ch5ex6.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Herman Ciechanowiec
 */
class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        UserService userService = context.getBean(UserService.class);

        CommentRepository commentRepositoryOne = commentService.getCommentRepository();
        CommentRepository commentRepositoryTwo = userService.getCommentRepository();

        boolean sameRepositories = commentRepositoryOne == commentRepositoryTwo;

        System.out.println("Same repositories: " + sameRepositories);
    }
}
