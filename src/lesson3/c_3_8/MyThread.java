package lesson3.c_3_8;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 19:41
 */

public class MyThread extends Thread {
    private Phaser phaser;

    public MyThread(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"A1 begin ");
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+"A1 end");
    }
}
