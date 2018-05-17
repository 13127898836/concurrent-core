package lesson2.c_2_1.c_2_1_4;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 09:32
 */

public class MyThread extends Thread {
    private CountDownLatch comingTag;//裁判等待所有运动员到来
    private CountDownLatch waitTag;//等待裁判说开始
    private CountDownLatch waitRunTag;//等待起跑
    private CountDownLatch begainTag;//起跑
    private CountDownLatch endTag;//所有运动员到终点

    public MyThread(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch begainTag, CountDownLatch endTag) {
        this.comingTag = comingTag;
        this.waitTag = waitTag;
        this.waitRunTag = waitRunTag;
        this.begainTag = begainTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName()+" 到起点了");
            comingTag.countDown();
            System.out.println("等待裁判说准备");
            waitTag.await();
            System.out.println("各就各位,准备");
            Thread.sleep((int) (Math.random() * 1000));
            waitRunTag.countDown();
            begainTag.await();
            System.out.println("开始跑，用时不确定");
            Thread.sleep((int) (Math.random() * 1000));
            endTag.countDown();
            System.out.println(Thread.currentThread().getName()+" 运动员到终点");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

