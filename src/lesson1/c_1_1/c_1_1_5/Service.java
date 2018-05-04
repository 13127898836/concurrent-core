package lesson1.c_1_1.c_1_1_5;

import java.util.concurrent.Semaphore;

/**
 * Created by cch
 * 2018-05-04 15:23.
 */

public class Service {
    private Semaphore semaphore = new Semaphore(10);
    public void testMethod(){
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.availablePermits());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
