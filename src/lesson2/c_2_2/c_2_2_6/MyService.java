package lesson2.c_2_2.c_2_2_6;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:12
 */

public class MyService {
    public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println(" 彻底结束");
        }
    });

    public void testMethod(){
        try{
            System.out.println(Thread.currentThread().getName()+" 准备");
            if(Thread.currentThread().getName().equals("C")){
                Thread.sleep(Integer.MAX_VALUE);
            }
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName()+" 开始");
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
