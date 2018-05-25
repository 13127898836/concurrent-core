package lesson3.c_3_3;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:43
 */

public class ThreadB extends Thread{
    private Phaser phaser;

    public ThreadB(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodA();
    }
}
