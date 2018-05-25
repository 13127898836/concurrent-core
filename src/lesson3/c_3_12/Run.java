package lesson3.c_3_12;

import java.util.concurrent.Phaser;

/**
 * Description:awitAdvance(0)打断没有异常
 * Author: Hank
 * Date: 2018/5/25 22:24
 */

public class Run
{
    public static void main(String[] args) {
        try{
            Phaser phaser = new Phaser(3);
            ThreadA a = new ThreadA(phaser);
            a.setName("A");
            a.start();
            Thread.sleep(5000);
            a.interrupt();
            System.out.println("-----------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
