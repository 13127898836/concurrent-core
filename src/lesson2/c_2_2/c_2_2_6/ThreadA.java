package lesson2.c_2_2.c_2_2_6;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:17
 */

public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
