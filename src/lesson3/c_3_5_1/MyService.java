package lesson3.c_3_5_1;

import java.util.concurrent.Phaser;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 19:10
 */

public class MyService {
    private Phaser phaser;

    public MyService(Phaser phaser) {
        this.phaser = phaser;
    }

    public void testMethod(){
        try{
            System.out.println("A begin name:"+Thread.currentThread().getName()+System.currentTimeMillis());
            if(Thread.currentThread().getName().equals("B")){
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("A end name:"+Thread.currentThread().getName()+System.currentTimeMillis());

            System.out.println("b begin name:"+Thread.currentThread().getName()+System.currentTimeMillis());
            if(Thread.currentThread().getName().equals("B")){
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("b end name:"+Thread.currentThread().getName()+System.currentTimeMillis());


            System.out.println("c begin name:"+Thread.currentThread().getName()+System.currentTimeMillis());
            if(Thread.currentThread().getName().equals("B")){
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("c end name:"+Thread.currentThread().getName()+System.currentTimeMillis());




        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
