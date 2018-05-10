package lesson1.c_1_1.c_1_1_6;

/**
 * Created by cch
 * 2018-05-10 16:16.
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
