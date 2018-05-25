package lesson2.c_2_2.c_2_2_6;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 19:17
 */

public class ThreadB extends Thread{
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
