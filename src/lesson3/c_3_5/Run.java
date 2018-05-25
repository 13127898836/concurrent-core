package lesson3.c_3_5;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 19:08
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        ThreadA a = new ThreadA(phaser);
        a.start();
    }
}
