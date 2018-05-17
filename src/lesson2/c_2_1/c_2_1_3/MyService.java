package lesson2.c_2_1.c_2_1_3;

import java.util.concurrent.CountDownLatch;

/**
 * Description: 运行过程中，没有可能有service 还没await
 * Author: Hank
 * Date: 2018/5/15 09:23
 */

public class MyService {
    private CountDownLatch down = new CountDownLatch(1);

    public void testMethod(){
        try{
            System.out.println(Thread.currentThread().getName()+" ready");
            down.await();
            System.out.println(Thread.currentThread().getName()+" finish");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void downMethod(){
        System.out.println("start");
        down.countDown();
    }
}
