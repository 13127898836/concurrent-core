package lesson2.c_2_1.c_2_1_2;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/11 11:43
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch maxRunner = new CountDownLatch(10);
        MyThread[] tArray = new MyThread[(int)maxRunner.getCount()];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(maxRunner);
            tArray[i].setName("线程"+(i+1));
            tArray[i].start();
        }
        maxRunner.await();
        System.out.println("都回来了");
    }
}
