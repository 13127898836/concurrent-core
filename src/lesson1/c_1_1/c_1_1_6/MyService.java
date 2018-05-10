package lesson1.c_1_1.c_1_1_6;

import java.util.concurrent.Semaphore;

/**
 * Created by cch
 * 2018-05-10 16:14.
 */

public class MyService {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try{
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("还有大约"+semaphore.getQueueLength()+"个线程在等待");
            System.out.println("是否有线程正在等待信号量？"+semaphore.hasQueuedThreads());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
