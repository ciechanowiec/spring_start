package eu.ciechanowiec.springstart.chapter6.ch6ex2.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.tinylog.Logger;

import java.util.Arrays;

/**
 * @author Herman Ciechanowiec
 */
@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* eu.ciechanowiec.springstart.chapter6.ch6ex2.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName =
                joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        Logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                "will be executed...");
        Object returnedByMethod = joinPoint.proceed();

        Logger.info("Method has been executed and returned + " + returnedByMethod);

        return returnedByMethod;
    }
}
