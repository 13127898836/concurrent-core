package lesson1.c_1_1.c_1_1_9;



/**
 * Created by cch
 * 2018-05-10 16:40.
 */

public class ThreadA extends  Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
