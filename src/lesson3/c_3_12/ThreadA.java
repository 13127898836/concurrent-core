package lesson3.c_3_12;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 22:18
 */

public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" A1 begin="+System.currentTimeMillis());
        phaser.awaitAdvance(0);
        System.out.println(Thread.currentThread().getName()+" A1 end="+System.currentTimeMillis());
    }
}
