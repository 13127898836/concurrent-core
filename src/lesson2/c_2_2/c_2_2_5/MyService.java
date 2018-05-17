package lesson2.c_2_2.c_2_2_5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 17:25
 */

public class MyService {
    public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束"+System.currentTimeMillis());
        }
    });

    public void testMethod(){
        System.out.println(Thread.currentThread().getName()+" 准备！");
        if(Thread.currentThread().getName().equals("Thread-0")){
            System.out.println("Thread-0 执行了 cyclicBarrier.await(5,TimeUnit.SECONDS)");
            try {
                cyclicBarrier.await(5, TimeUnit.SECONDS);
                if(Thread.currentThread().getName().equals("Thread-1")){
                    System.out.println("Thread-1执行了cyclicBarrier.await()");
                    cyclicBarrier.await();
                }
                System.out.println(Thread.currentThread().getName()+" 开始");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" InterruptedException");
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName()+" BrokenBarrierException");
            } catch (TimeoutException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName()+" TimeoutException");
            }
        }
    }
}
