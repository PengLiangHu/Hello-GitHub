package com.t46.ssm.aspect;

import com.t46.ssm.service.proxy.ProxyMathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: aopSemiAutomatic
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 19:06
 * @version: 1.0
 */
public class aopAutoComponent {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aopAutoComponent.xml");
        ProxyMathService proxyMathService=(ProxyMathService)applicationContext.getBean("MathService");
        proxyMathService.add(1,1);
        proxyMathService.div(1,1);
        proxyMathService.mut(1,1);
        proxyMathService.sub(1,1);
    }
}
