package lesson1.c_1_1.c_1_1_12;

/**
 * Author: Hank
 * Date: 2018/5/10.
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        MyThread[] threadArray = new MyThread[12];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();
        }
    }
}
