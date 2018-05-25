package lesson3.c_3_10;

import java.util.concurrent.Phaser;

/**
 * Description:C 先执行，到达了3 置0 然后 AB 一直等
 * Author: Hank
 * Date: 2018/5/25 21:36
 */

public class Run
{
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        MyService service = new MyService(phaser);

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
