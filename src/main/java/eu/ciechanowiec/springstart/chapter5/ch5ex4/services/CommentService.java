package eu.ciechanowiec.springstart.chapter5.ch5ex4.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
@Lazy
public class CommentService {

    CommentService() {
        System.out.println("CommentService instance created!");
    }
}
