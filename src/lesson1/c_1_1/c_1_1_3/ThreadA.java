package lesson1.c_1_1.c_1_1_3;

/**
 * Created by cch
 * 2018-05-04 14:56.
 */

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
