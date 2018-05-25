package lesson3.c_3_5_1;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/25 19:17
 */

public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
