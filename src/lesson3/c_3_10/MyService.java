package lesson3.c_3_10;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 21:28
 */

public class MyService {
    public Phaser phaser;

    public MyService(Phaser phaser) {
        this.phaser = phaser;
    }
    public void testMethodA(){
        try{
            System.out.println(Thread.currentThread().getName()+" begin A1"+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName()+" end A1"+System.currentTimeMillis());


            System.out.println(Thread.currentThread().getName()+" begin A2"+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName()+" end A2"+System.currentTimeMillis());

            System.out.println(Thread.currentThread().getName()+" begin A3"+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(phaser.getArrivedParties());
            phaser.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread().getName()+" end A3"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void testMethodB(){
        try{
            System.out.println(Thread.currentThread().getName()+" begin A1"+System.currentTimeMillis());
            phaser.arrive();
            System.out.println(Thread.currentThread().getName()+" end A1"+System.currentTimeMillis());


            System.out.println(Thread.currentThread().getName()+" begin A2"+System.currentTimeMillis());
            phaser.arrive();
            System.out.println(Thread.currentThread().getName()+" end A2"+System.currentTimeMillis());

            System.out.println(Thread.currentThread().getName()+" begin A3"+System.currentTimeMillis());
            phaser.arrive();
            System.out.println(Thread.currentThread().getName()+" end A3"+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
