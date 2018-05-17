package lesson2.c_2_2.c_2_2_4;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 17:11
 */

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testA();
    }
}
