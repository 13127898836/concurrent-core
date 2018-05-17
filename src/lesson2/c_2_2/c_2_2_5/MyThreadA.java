package lesson2.c_2_2.c_2_2_5;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 17:31
 */

public class MyThreadA extends Thread {
    private MyService service;

    public MyThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
