package lesson2.c_2_2.c_2_2_7;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:29
 */

public class MyThreadB extends Thread {
    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
