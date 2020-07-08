package com.t46.ssm.cgLib;

import com.t46.ssm.factory.CgLib;
import com.t46.ssm.service.cgLib.CglibMath;

/**
 * @ClassName: cglibTest
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 17:52
 * @version: 1.0
 */
public class CglibTest {
    public static void main(String[] args) {
        CglibMath cglibMath=(CglibMath)new CgLib().getCgLib(new CglibMath());
        cglibMath.add(1,1);
        cglibMath.div(1,1);
        cglibMath.mut(1,1);
        cglibMath.sub(1,1);
    }
}
