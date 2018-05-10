package lesson1.c_1_1.c_1_1_7;

import java.util.concurrent.Semaphore;

/**
 * Created by cch
 * 2018-05-10 16:27.
 */

public class MyService {
    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1,isFair);

    public void testMethod(){
        try{
            semaphore.acquire();
            System.out.println("ThreadName="+Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
