package eu.ciechanowiec.springstart.chapter9.ch9ex3;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @author Herman Ciechanowiec
 */
@Service
@ApplicationScope
public class LoginCountService {

    private int count;

    public void incrementByOne() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
