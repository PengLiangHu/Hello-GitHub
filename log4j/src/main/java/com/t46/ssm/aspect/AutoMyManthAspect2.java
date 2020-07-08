package com.t46.ssm.aspect;

import com.t46.ssm.utils.ThreadSleep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyManthAspect
 * @description: TODO aop半自动代理
 * @author: PengLiangHu
 * @date: 2020/7/6 17:20
 * @version: 1.0
 */
@Component
@Aspect
public class AutoMyManthAspect2 {
    private Logger logger = LogManager.getLogger(AutoMyManthAspect2.class);
    @Pointcut("execution(* com.t46.ssm.service..*.*(..))")
    public void pointcut(){

    }
    @Before("pointcut()")
    public void before(){
        logger.info("aop全自动动态代理开始");

    }
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //开始时间
        long start=System.currentTimeMillis();
        ThreadSleep.lazy();
        //放行
        Object result=pjp.proceed();
        Long span= System.currentTimeMillis()-start;
        logger.info("共用时："+span);
        return result;
    }
    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void afterThrowing(JoinPoint jq, Throwable e){
        logger.info(jq.getSignature().getName()+"方法发送异常："+e.getMessage());
    }
    @After("execution(* com.t46.ssm.service..*.*(..))")
    public void after(){

        logger.info("aop全自动动态代理结束");
    }

}
