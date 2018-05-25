package lesson3.c_3_11;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 21:52
 */

public class ThreadC extends Thread {
    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " B1 begin " + System.currentTimeMillis());
            Thread.sleep(3000);
            phaser.awaitAdvance(0);
            System.out.println(Thread.currentThread().getName() + " B1 end " + System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
