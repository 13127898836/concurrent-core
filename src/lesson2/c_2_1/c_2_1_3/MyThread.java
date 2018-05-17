package lesson2.c_2_1.c_2_1_3;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 09:25
 */

public class MyThread extends Thread{
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
