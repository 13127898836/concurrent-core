package lesson3.c_3_11;

import java.util.concurrent.Phaser;

/**
 * Description: awaitAdvance(int Phase) 不参与parties技术的操作
 * Author: Hank
 * Date: 2018/5/25 22:10
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);

        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(phaser);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(phaser);
        c.setName("C");
        c.start();

        ThreadD d = new ThreadD(phaser);
        d.setName("D");
        d.start();
    }
}
