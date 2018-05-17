package lesson2.c_2_2.c_2_2_3;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:57
 */

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.beginRun();
    }
}
