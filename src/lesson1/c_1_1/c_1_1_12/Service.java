package lesson1.c_1_1.c_1_1_12;

import java.util.concurrent.Semaphore;

/**
 * 多进路-多处理-多出路实验
 * Author: Hank
 * Date: 2018/5/10.
 */

public class Service {

    private Semaphore semaphore = new Semaphore(3);

    public void sayHello(){
        try{
            semaphore.acquire();
            System.out.println("ThreadName:"+ Thread.currentThread().getName()+" 准备");
            System.out.println("begain hello"+System.currentTimeMillis());
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+" 打印 "+(i+1));
            }
            System.out.println("end hello "+System.currentTimeMillis());
            semaphore.release();
            System.out.println("ThreadName="+Thread.currentThread().getName()+" 结束");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
