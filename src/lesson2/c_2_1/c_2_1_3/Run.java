package lesson2.c_2_1.c_2_1_3;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 09:26
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread[] tArray = new MyThread[10];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(myService);
            tArray[i].setName("thread"+(i+1));
            tArray[i].start();
        }
        Thread.sleep(2000);
        myService.downMethod();
    }
}
