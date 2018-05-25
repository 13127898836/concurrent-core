package lesson3.c_3_5;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 19:03
 */

public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A edn phase value="+phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A edn phase value="+phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A edn phase value="+phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A edn phase value="+phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A edn phase value="+phaser.getPhase());
    }
}
