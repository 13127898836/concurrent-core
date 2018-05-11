package lesson2.c_2_1.c_2_1_1;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/11 11:24
 */

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
