package lesson1.c_1_1.c_1_1_11;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * tryAcquire(int premits,long timeout,TimeUnit unit)使用
 * Author: Hank
 * Date: 2018/5/10.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(3);

    public void testMethod(){
        try {
            if(semaphore.tryAcquire(3,3, TimeUnit.SECONDS)){
                System.out.println("ThreadName:"+Thread.currentThread().getName()+" 首先进入");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {

                }
                semaphore.release(3);
            }else {
                System.out.println("ThreadName:"+Thread.currentThread().getName()+" 未成功进入");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
