package com.t46.ssm.aspect;

import com.t46.ssm.utils.ThreadSleep;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName: MyManthAspect
 * @description: TODO aop半自动代理
 * @author: PengLiangHu
 * @date: 2020/7/6 17:20
 * @version: 1.0
 */
public class MyManthAspect implements MethodInterceptor{
    private Logger logger = LogManager.getLogger(MyManthAspect.class);
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        logger.info("aop半自动动态代理开始");
        //开始时间
        long start=System.currentTimeMillis();
        ThreadSleep.lazy();
        Object result=methodInvocation.proceed();
        Long span= System.currentTimeMillis()-start;
        logger.info("aop半自动动态代理结束：共用时："+span);
        return result;
    }
}
