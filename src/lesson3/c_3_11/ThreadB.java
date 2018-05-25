package lesson3.c_3_11;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 21:52
 */

public class ThreadB extends Thread {
    private Phaser phaser;

    public ThreadB(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" B1 begin "+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" B1 end "+System.currentTimeMillis());
    }
}
