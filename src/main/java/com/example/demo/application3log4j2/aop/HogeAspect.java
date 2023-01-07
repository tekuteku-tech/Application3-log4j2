package com.example.demo.application3log4j2.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HogeAspect {

    private Logger logger;

    public HogeAspect() {
        this.logger = LogManager.getLogger();
    }

    @After("within(com.example.demo.application3log4j2.Main)")
    public void handler(JoinPoint joinPoint) {

        methodLog(joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), "start");

    }

    private void methodLog(String className, String methodName, String message) {
        logger.info(className + "." + methodName + "() " + message + ".");
    }
}
