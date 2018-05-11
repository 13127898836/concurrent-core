package lesson2.c_2_1.c_2_1_1;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/11 11:25
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread thread = new MyThread(service);
        thread.start();
        Thread.sleep(1000);
        service.downMethod();
    }
}
