package lesson2.c_2_1.c_2_1_4;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 09:41
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch comingTag = new CountDownLatch(10);
        CountDownLatch waitTag = new CountDownLatch(1);
        CountDownLatch waitRunTag = new CountDownLatch(10);
        CountDownLatch beginTag = new CountDownLatch(1);
        CountDownLatch endTag = new CountDownLatch(10);
        MyThread[] threadArray = new MyThread[10];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(comingTag,waitTag,waitRunTag,beginTag,endTag);
            threadArray[i].start();
        }
        System.out.println("裁判等待选手到来");
        comingTag.await();
        System.out.println("裁判看到运动员到了，巡视5秒");
        Thread.sleep(5000);
        waitTag.countDown();
        System.out.println("各就各位！@");

        waitRunTag.await();
        Thread.sleep(2000);
        System.out.println("发令抢响起！");
        beginTag.countDown();
        endTag.await();
        System.out.println("统计名次");
    }
}
