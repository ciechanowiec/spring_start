package eu.ciechanowiec.springstart.chapter6.ch6ex6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Aspect
public class LoggingAspect {

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        Logger.info("Logging Aspect: Method executed and returned: " + returnedValue);
        return returnedValue;
    }
}
