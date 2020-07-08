package com.t46.ssm.factory;

import com.t46.ssm.utils.ThreadSleep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName: CgLib
 * @description: TODO cglib代理
 * @author: PengLiangHu
 * @date: 2020/7/6 17:39
 * @version: 1.0
 */
public class CgLib {
    private Logger logger = LogManager.getLogger(CgLib.class);
    public Object getCgLib(Object object){
        //创建增强对象
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(object.getClass());
        //设置回调(拦截)
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //开始时间
                long start=System.currentTimeMillis();
                logger.info("cglib动态代理开始");
                ThreadSleep.lazy();
                //Object result= method.invoke(object,objects);
                //跟上面这句等价,解耦方式
                Object result= methodProxy.invokeSuper(o,objects);
                Long span= System.currentTimeMillis()-start;
                logger.info("cglib动态代理结束：共用时："+span);
                return result;
            }
        });
        Object newObject=enhancer.create();
        return newObject;
    }

}
