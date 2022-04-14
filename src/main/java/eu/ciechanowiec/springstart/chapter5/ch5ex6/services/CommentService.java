package eu.ciechanowiec.springstart.chapter5.ch5ex6.services;

import eu.ciechanowiec.springstart.chapter5.ch5ex6.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
