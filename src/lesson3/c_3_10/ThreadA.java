package lesson3.c_3_10;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 21:34
 */

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethodA();
    }
}
