package lesson1.c_1_1.c_1_1_15;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description: 使用Semaphore 实现多生产者 多消费者
 * Author: Hank
 * Date: 2018/5/10 17:47
 */

public class RepastService {
    volatile private Semaphore setSemaphore = new Semaphore(10);
    volatile private Semaphore getSemaphore = new Semaphore(20);
    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();
    //producePosition 变量的含义最多只有4个盒子存放菜品
    volatile private Object[] producePosition = new Object[4];

    private boolean isEmpty(){
        boolean isEmpty = true;
        for (int i = 0; i < producePosition.length; i++) {
            if(producePosition[i]!=null){
                isEmpty=false;
                break;
            }
        }
        return isEmpty;
    }

    private boolean isFull(){
        boolean isFull = true;
        for (int i = 0; i < producePosition.length; i++) {
            if(producePosition[i]==null){
                isFull=false;
                break;
            }
        }
        return isFull;
    }

    public void set(){
        try{
            System.out.println(Thread.currentThread().getName()+" 生产 set");
            setSemaphore.acquire();//最多允许10个
            lock.lock();
            while(isFull()){
                setCondition.await();
            }
            for (int i = 0; i < producePosition.length; i++) {
                if(producePosition[i]==null){
                    producePosition[i] = "数据";
                    System.out.println(Thread.currentThread().getName()+" 生产了 "+producePosition[i]);
                    break;
                }
            }
            getCondition.signalAll();
           // System.out.println(Thread.currentThread().getName()+"生产 signalAll");
            lock.unlock();
           // System.out.println(Thread.currentThread().getName()+"生产 unlock");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            setSemaphore.release();
        }
    }

    public void get(){
        try{
            System.out.println(Thread.currentThread().getName()+"消费 get");
            getSemaphore.acquire();
            lock.lock();
            while (isEmpty()){
                getCondition.await();
            }
            for (int i = 0; i < producePosition.length; i++) {
                if(producePosition[i]!=null){
                    System.out.println(Thread.currentThread().getName()+" 消费了 "+producePosition[i]);
                    producePosition[i] =null;
                    break;
                }
            }
            setCondition.signalAll();
            //System.out.println(Thread.currentThread().getName()+" 消费 signalAll");
            lock.unlock();
           // System.out.println(Thread.currentThread().getName()+" 消费 unlock");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            getSemaphore.release();
        }
    }

}
