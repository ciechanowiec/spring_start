package eu.ciechanowiec.springstart.chapter9.ch9ex3;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @author Herman Ciechanowiec
 */
@Service
@ApplicationScope
class LoginCountService {

    private int count;

    void incrementByOne() {
        count++;
    }

    int getCount() {
        return count;
    }
}
