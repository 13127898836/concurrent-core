package lesson2.c_2_2.c_2_2_1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:41
 */

public class ThreadA extends Thread {
    private CyclicBarrier cbRef;

    public ThreadA(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    @Override
    public void run() {
        try{
            System.out.println(Thread.currentThread().getName()+" begain 等待凑齐两个继续运行");
            cbRef.await();
            System.out.println(Thread.currentThread().getName()+" end 已经凑齐继续运行");
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
