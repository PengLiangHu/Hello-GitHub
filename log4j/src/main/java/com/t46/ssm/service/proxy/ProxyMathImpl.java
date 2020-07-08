package com.t46.ssm.service.proxy;

import org.springframework.stereotype.Service;

/**
 * @ClassName: math
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 11:29
 * @version: 1.0
 */
@Service("MathService")
public class ProxyMathImpl implements ProxyMathService {
        //加
        public int add(int n1,int n2){
            int result=n1+n2;
            System.out.println(n1+"+"+n2+"="+result);
            return result;
        }
        //减
        public int sub(int n1,int n2){
            int result=n1-n2;
            System.out.println(n1+"-"+n2+"="+result);
            return result;
        }
        //乘
        public int mut(int n1,int n2){
            int result=n1*n2;
            System.out.println(n1+"X"+n2+"="+result);
            return result;
        }
        //除
        public int div(int n1,int n2){
            int result=n1/n2;
            System.out.println(n1+"/"+n2+"="+result);
            return result;
        }
}
