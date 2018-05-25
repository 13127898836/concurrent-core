package lesson2.c_2_2.c_2_2_6;

/**
 * Description:getParties() getNumberWaiting()
 * Author: Hank
 * Date: 2018/5/17 19:20
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        ThreadC c = new ThreadC(myService);
        c.setName("C");


        a.start();
        b.start();
        c.start();
        Thread.sleep(2000);
        System.out.println("屏蔽对象的parties个数:"+myService.cyclicBarrier.getParties());
        System.out.println("屏蔽处等待的线程数："+myService.cyclicBarrier.getNumberWaiting());

    }
}
