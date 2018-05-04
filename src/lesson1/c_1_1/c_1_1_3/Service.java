package lesson1.c_1_1.c_1_1_3;

import java.util.concurrent.Semaphore;

/**
 * 方法 acquire（int permits）参数作用以及动态增加permits 许可数量
 * acquire 会消耗许可数量
 * release 会释放许可数量
 * Created by cch
 * 2018-05-04 14:52.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(10);

    public void testMethod(){
        try{
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName()+" begin");
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" end");
            semaphore.release(2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
