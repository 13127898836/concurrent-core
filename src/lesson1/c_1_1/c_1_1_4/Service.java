package lesson1.c_1_1.c_1_1_4;

import java.util.concurrent.Semaphore;

/**
 * acquire的使用 被打断 会报错
 * acquireUninterruptibly 的使用 打断不报错
 * Created by cch
 * 2018-05-04 15:06.
 */

public class Service {
    private Semaphore semaphore= new Semaphore(1);

    public void testMethod(){
        try{
            //semaphore.acquire();
            semaphore.acquireUninterruptibly();
            System.out.println(Thread.currentThread().getName()+" start");
            for (int i = 0; i < Integer.MAX_VALUE/50; i++) {
                String str = new String();
                Math.random();
            }
            System.out.println(Thread.currentThread().getName()+" end");
        }catch (Exception e){
            System.out.println(Thread.currentThread().getName()+" 异常");
            e.printStackTrace();
        }
    }
}
