package lesson1.c_1_1.c_1_1_9;

import java.util.concurrent.Semaphore;

/**
 * Author: Hank
 * Date: 2018/5/10.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(3);

    public void testMethod(){
        if(semaphore.tryAcquire(2)){
            System.out.println("ThreadName:"+Thread.currentThread().getName()+" 首先进入");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release(2);
        }else {
            System.out.println("ThreadName:"+Thread.currentThread().getName()+" 未成功进入");
        }
    }
}
