package com.t46.ssm.utils;

import java.util.Random;

/**
 * @ClassName: ThreadSleep
 * @description: TODO
 * @author: PengLiangHu
 * @date: 2020/7/6 18:22
 * @version: 1.0
 */
public class ThreadSleep {
    //模拟延时
    public static void lazy()
    {
        try {
            int n=(int)new Random().nextInt(500);
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
