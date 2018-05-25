package lesson2.c_2_2.c_2_2_7;

/**
 * Description: reset() 重置屏障
 * Author: Hank
 * Date: 2018/5/17 19:30
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThreadA a = new MyThreadA(service);
        a.setName("A");
        MyThreadB b = new MyThreadB(service);
        b.setName("B");
        a.start();
        b.start();
        Thread.sleep(2000);
        service.cyclicBarrier.reset();
    }
}
