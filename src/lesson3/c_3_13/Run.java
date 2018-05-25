package lesson3.c_3_13;

import java.util.concurrent.Phaser;

/**
 * Description:awaitAdvanceInterruptibly() 被打断 会报错
 * Author: Hank
 * Date: 2018/5/25 22:56
 */

public class Run {
    public static void main(String[] args) {
        try{
            Phaser phaser = new Phaser(3);
            ThreadA a = new ThreadA(phaser);
            a.setName("A");
            a.start();
            Thread.sleep(5000);
            a.interrupt();
            System.out.println("中断了");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
