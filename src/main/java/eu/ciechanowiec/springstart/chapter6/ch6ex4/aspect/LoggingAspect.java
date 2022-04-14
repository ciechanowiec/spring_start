package eu.ciechanowiec.springstart.chapter6.ch6ex4.aspect;

import eu.ciechanowiec.springstart.chapter6.ch6ex4.model.Comment;
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

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        Logger.info("Method " + methodName +
                    " with parameters " + Arrays.asList(arguments) +
                    " will be executed...");

        Object returnedByMethod = joinPoint.proceed();

        Logger.info("Method has been executed and returned: " + returnedByMethod);
    }
}
