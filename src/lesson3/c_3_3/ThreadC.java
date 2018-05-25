package lesson3.c_3_3;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:45
 */

public class ThreadC extends Thread{
    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
