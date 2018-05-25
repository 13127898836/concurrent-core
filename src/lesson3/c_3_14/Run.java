package lesson3.c_3_14;

import java.util.concurrent.Phaser;

/**
 * Description:awaitAdvanceInterruptibly(int phase) 达到数量才会中断
 * Author: Hank
 * Date: 2018/5/25 23:11
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

    }
}
