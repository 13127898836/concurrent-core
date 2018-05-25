package lesson3.c_3_14;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 23:09
 */

public class ThreadA extends Thread{
    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" A1 begin="+System.currentTimeMillis());
            phaser.awaitAdvanceInterruptibly(10);
            System.out.println(Thread.currentThread().getName()+" A1 end="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
