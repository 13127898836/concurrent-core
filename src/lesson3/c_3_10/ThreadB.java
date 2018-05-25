package lesson3.c_3_10;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 21:35
 */

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethodA();
    }
}
