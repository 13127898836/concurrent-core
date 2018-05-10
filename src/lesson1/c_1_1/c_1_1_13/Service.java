package lesson1.c_1_1.c_1_1_13;

import java.util.LinkedHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多进路-多处理-多出路实验
 * Author: Hank
 * Date: 2018/5/10.
 */

public class Service {

    private Semaphore semaphore = new Semaphore(3);
    private ReentrantLock lock = new ReentrantLock();
    public void sayHello(){
        try{
            semaphore.acquire();
            System.out.println("ThreadName:"+ Thread.currentThread().getName()+" 准备");
            lock.lock();
            System.out.println("begain hello"+System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" 打印 "+(i+1));
            }
            System.out.println("end hello "+System.currentTimeMillis());
            lock.unlock();
            semaphore.release();
            System.out.println("ThreadName="+Thread.currentThread().getName()+" 结束");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
