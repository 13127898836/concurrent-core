package lesson1.c_1_1.c_1_1_3;

import java.util.concurrent.Semaphore;

/**
 * 构造函数的 permits 并不是 上限数量
 * release 可以使许可数量动态增加
 * Created by cch
 * 2018-05-04 15:02.
 */

public class Run2 {
    public static void main(String[] args) {
        try{
            Semaphore semaphore = new Semaphore(5);
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            System.out.println(semaphore.availablePermits());
            semaphore.release(4);
            System.out.println(semaphore.availablePermits());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
