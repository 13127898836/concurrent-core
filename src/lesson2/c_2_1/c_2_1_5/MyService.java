package lesson2.c_2_1.c_2_1_5;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 09:58
 */

public class MyService {
    public CountDownLatch count = new CountDownLatch(1);

    public void testMethod(){
        try{
            System.out.println(Thread.currentThread().getName()+" 准备");
            count.await(3, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName()+" 结束");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
