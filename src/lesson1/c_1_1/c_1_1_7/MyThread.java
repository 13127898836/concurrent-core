package lesson1.c_1_1.c_1_1_7;

/**
 * Created by cch
 * 2018-05-10 16:30.
 */

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        System.out.println("ThreadName="+this.getName()+" 启动了");
        myService.testMethod();
    }
}
