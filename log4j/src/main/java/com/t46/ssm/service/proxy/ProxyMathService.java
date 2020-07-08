package com.t46.ssm.service.proxy;

/**
 * @ClassName: IMath
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 11:29
 * @version: 1.0
 */
public interface ProxyMathService {
        //加
        public int add(int n1, int n2);
        //减
        public int sub(int n1, int n2);
        //乘
        public int mut(int n1, int n2);
        //除
        public int div(int n1, int n2);
}
