package lesson2.c_2_2.c_2_2_2;

import java.util.concurrent.CyclicBarrier;

/**
 * Description:验证屏障重置性  以及 getNumberWaiting()方法使用
 * Author: Hank
 * Date: 2018/5/17 16:48
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(3);

        ThreadA threadA1 = new ThreadA(cbRef);
        threadA1.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA2 = new ThreadA(cbRef);
        threadA2.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA3 = new ThreadA(cbRef);
        threadA3.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA4 = new ThreadA(cbRef);
        threadA4.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());


    }
}
