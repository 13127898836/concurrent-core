package lesson1.c_1_1.c_1_1_12;

/**
 * Author: Hank
 * Date: 2018/5/10.
 */

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.sayHello();
    }
}
