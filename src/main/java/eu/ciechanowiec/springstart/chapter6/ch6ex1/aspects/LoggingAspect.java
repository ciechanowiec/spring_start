package eu.ciechanowiec.springstart.chapter6.ch6ex1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* eu.ciechanowiec.springstart.chapter6.ch6ex1.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger.info("Method will be executed...");
        joinPoint.proceed();
        Logger.info("Method has been executed...");
    }
}
