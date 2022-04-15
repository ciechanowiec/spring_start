package eu.ciechanowiec.springstart.chapter6.ch6ex6.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Aspect
public class SecurityAspect {

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger.info("Security Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        Logger.info("Security Aspect: Method executed and returned: " + returnedValue);
        return returnedValue;
    }
}
