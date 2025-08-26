package com.mengly_dev.java_spring_boot_assingment.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Aspect
@Component
public class AuditAspect {
    @Around("@annotation(com.mengly_dev.java_spring_boot_assingment.utils.AuditFilter)")
    public Object logAudit(ProceedingJoinPoint joinPoint) throws Throwable {
        String processId = UUID.randomUUID().toString();
        long startTime = System.currentTimeMillis();
        System.out.println("Audit Start - Process ID: " + processId + ", Timestamp: " + Instant.now());

        try {
            return joinPoint.proceed();
        } finally {
            long duration = System.currentTimeMillis() - startTime;
            System.out.println("Audit End - Process ID: " + processId + ", Duration: " + duration + " ms");
        }
    }
}
