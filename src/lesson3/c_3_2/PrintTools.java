package lesson3.c_3_2;

import java.util.concurrent.Phaser;

/**
 * Description:arriveAndAwaitAdvance() 方法测试1
 * Author: Hank
 * Date: 2018/5/17 19:37
 */

public class PrintTools {
    public static Phaser phaser;

    public static void methodA(){
        System.out.println(Thread.currentThread().getName()+" A1 begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A1 end");
        System.out.println(Thread.currentThread().getName()+" A2 begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName()+" A2 end");

    }

    public static void methodB(){
        try {
            System.out.println(Thread.currentThread().getName() + " A1 begin");
            Thread.sleep(5000);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + " A1 end");
            System.out.println(Thread.currentThread().getName() + " A2 begin");
            Thread.sleep(5000);
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName() + " A2 end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
