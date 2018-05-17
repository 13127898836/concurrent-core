package lesson2.c_2_2.c_2_2_1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:初步使用
 * Author: Hank
 * Date: 2018/5/15 10:32
 */

public class MyThread extends Thread {
    private CyclicBarrier cbRef;

    public MyThread(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    @Override
    public void run() {
        try{
            Thread.sleep((int)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName()+" 到了");
            cbRef.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
