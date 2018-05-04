package lesson1.c_1_1.c_1_1_1;

import java.util.concurrent.Semaphore;

/**
 * 类 Semaphore 的同步性 构造函数 permits 代表 并发数
 * Created by cch
 * 2018-05-04 14:42.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try{
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName()
            +" begin timer= "+System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+
            " end timer= "+System.currentTimeMillis());
            semaphore.release();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
