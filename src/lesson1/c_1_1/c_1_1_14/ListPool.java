package lesson1.c_1_1.c_1_1_14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: 使用Semaphore 创建字符串池
 * Author: Hank
 * Date: 2018/5/10 17:22
 */

public class ListPool {
    private int poolMaxSize = 5 ;
    private int semaphorePermits = 3 ;
    private List<String> list = new ArrayList<>();
    private Semaphore concurrencySemaphore = new Semaphore(semaphorePermits);
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public ListPool(){
        for (int i = 0; i < poolMaxSize; i++) {
            list.add("cch"+(i+1));
        }
    }

    public String get(){
        String getString = null;
        try{
            concurrencySemaphore.acquire();
            lock.lock();
            while (list.size()==0){
                condition.await();
            }
            getString = list.remove(0);
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return getString;
    }

    public void put(String stringValue){
        lock.lock();
        list.add(stringValue);
        condition.signalAll();
        lock.unlock();
        concurrencySemaphore.release();
    }
}
