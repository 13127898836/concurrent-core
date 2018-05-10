package lesson1.c_1_1.c_1_1_8;

import java.util.concurrent.Semaphore;

/**
 * tryAcquire 测试
 * Created by cch
 * 2018-05-10 16:36.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        if(semaphore.tryAcquire()){
            System.out.println("ThreadName"+Thread.currentThread().getName()+" 首先进入");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        }else {
            System.out.println("ThreadName:"+Thread.currentThread().getName()+" 未成功进入");
        }
    }
}
