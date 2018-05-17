package lesson2.c_2_1.c_2_1_5;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 10:05
 */

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
