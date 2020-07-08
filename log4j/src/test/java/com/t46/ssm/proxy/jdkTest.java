package com.t46.ssm.proxy;


import com.t46.ssm.service.proxy.ProxyMathService;
import com.t46.ssm.service.proxy.ProxyMathImpl;
import com.t46.ssm.factory.jdkProxy;

/**
 * @ClassName: jdkTest
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 11:35
 * @version: 1.0
 */
public class jdkTest {
    public static void main(String[] args) {
        ProxyMathService math= (ProxyMathService) new jdkProxy().getJdkProxy(new ProxyMathImpl());
        math.add(1,2);

    }
}
