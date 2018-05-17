package lesson2.c_2_2.c_2_2_5;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 17:31
 */

public class MyThreadB  extends Thread{
    private MyService myService;

    public MyThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
