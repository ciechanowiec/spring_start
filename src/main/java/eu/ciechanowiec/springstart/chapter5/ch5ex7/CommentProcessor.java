package eu.ciechanowiec.springstart.chapter5.ch5ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    void setComment(Comment comment) {
        this.comment = comment;
    }

    Comment getComment() {
        return comment;
    }

    void processComment(Comment comment) {
        // changing the comment attribute
    }

    void validateComment(Comment comment) {
        // validating and changing the comment attribute
    }
}
