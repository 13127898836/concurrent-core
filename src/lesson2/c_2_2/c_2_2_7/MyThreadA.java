package lesson2.c_2_2.c_2_2_7;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:28
 */

public class MyThreadA extends Thread {
    private MyService myService;

    public MyThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
