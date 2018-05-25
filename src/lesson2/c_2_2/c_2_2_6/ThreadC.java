package lesson2.c_2_2.c_2_2_6;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:19
 */

public class ThreadC extends Thread {
    private MyService myService;

    public ThreadC(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
