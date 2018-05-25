package lesson3.c_3_13;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 22:44
 */

public class ThreadA extends Thread {
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" A1 begin="+System.currentTimeMillis());
            phaser.awaitAdvanceInterruptibly(0);
            System.out.println(Thread.currentThread().getName()+" A1 end="+System.currentTimeMillis());
        }catch (Exception e){
            System.out.println("进入catch");
            e.printStackTrace();
        }
    }
}
