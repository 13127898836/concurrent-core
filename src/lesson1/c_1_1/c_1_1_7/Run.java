package lesson1.c_1_1.c_1_1_7;

/**
 * Created by cch
 * 2018-05-10 16:31.
 */

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread firstThread = new MyThread(service);
        firstThread.start();
        MyThread[] threadArray = new MyThread[5];
        for (int i = 0; i < 5; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();
        }
    }
}
