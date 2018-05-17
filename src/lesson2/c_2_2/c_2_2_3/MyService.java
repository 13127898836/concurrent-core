package lesson2.c_2_2.c_2_2_3;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:53
 */

public class MyService {
    private CyclicBarrier cbRef;

    public MyService(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    public void beginRun(){
        try{
            long sleepValue = (int) (Math.random()*10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName()+" begin第一阶段"+(cbRef.getNumberWaiting()+1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName()+" begin第一阶段"+(cbRef.getNumberWaiting()));
            sleepValue = (int) (Math.random()*10000);
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName()+" begin第二阶段"+(cbRef.getNumberWaiting()+1));
            cbRef.await();
            System.out.println(Thread.currentThread().getName()+" begin二阶段"+(cbRef.getNumberWaiting()));

        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }


    }
}
