package eu.ciechanowiec.springstart.chapter6.ch6ex5.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Aspect
public class LoggingAspect {

    @AfterReturning(value = "@annotation(ToLog)",
                    returning = "returnedValue")
    public void log(Object returnedValue) throws Throwable {
        Logger.info("Method executed and returned: " + returnedValue);
    }
}
