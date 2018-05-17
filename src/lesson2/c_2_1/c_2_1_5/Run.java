package lesson2.c_2_1.c_2_1_5;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/15 10:06
 */

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread[] threadArray = new MyThread[3];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] =  new MyThread(service);
        }
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
