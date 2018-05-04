package lesson1.c_1_1.c_1_1_1;

/**
 * Created by cch
 * 2018-05-04 14:46.
 */

public class ThreadB extends Thread{
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
