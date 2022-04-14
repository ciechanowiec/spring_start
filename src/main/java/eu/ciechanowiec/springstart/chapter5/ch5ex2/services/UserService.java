package eu.ciechanowiec.springstart.chapter5.ch5ex2.services;

import eu.ciechanowiec.springstart.chapter5.ch5ex2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
