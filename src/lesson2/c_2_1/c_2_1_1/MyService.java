package lesson2.c_2_1.c_2_1_1;

import java.util.concurrent.CountDownLatch;

/**
 * Description:CountDownLatch 的基本使用
 * Author: Hank
 * Date: 2018/5/11 11:18
 */

public class MyService {
    private CountDownLatch down= new CountDownLatch(1);
    public void testMethod(){
        try{
            System.out.println("A");
            down.await();
            System.out.println("B");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void downMethod(){
        System.out.println("X");
        down.countDown();
    }
}
