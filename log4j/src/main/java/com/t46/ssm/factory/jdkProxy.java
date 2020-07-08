package com.t46.ssm.factory;

import com.t46.ssm.utils.ThreadSleep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @ClassName: jdkProxy
 * @description: TODO jdk动态代理
 * @author: PengLiangHu
 * @date: 2020/7/6 11:31
 * @version: 1.0
 */
public class jdkProxy implements InvocationHandler{
    private Logger logger = LogManager.getLogger(jdkProxy.class);
    private Object object;
    public Object getJdkProxy(Object o){
        this.object=o;
        return Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                this
                );
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //开始时间
        long start=System.currentTimeMillis();
        logger.info("jdk动态代理开始");
        ThreadSleep.lazy();
        Object obj= method.invoke(this.object,args);
        Long span= System.currentTimeMillis()-start;
        logger.info("jdk动态代理结束：共用时："+span);
        return obj;
    }
}
