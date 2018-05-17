package lesson2.c_2_1.c_2_1_6;

import java.util.concurrent.CountDownLatch;

/**
 * Description: getCount()的使用
 * Author: Hank
 * Date: 2018/5/15 10:11
 */

public class Run {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(3);
        System.out.println("main getCoun1="+count.getCount());
        count.countDown();
        System.out.println("main getCoun2="+count.getCount());
        count.countDown();
        System.out.println("main getCoun3="+count.getCount());
        count.countDown();
        System.out.println("main getCoun4="+count.getCount());
        count.countDown();
        System.out.println("main getCoun5="+count.getCount());
        count.countDown();
    }
}
