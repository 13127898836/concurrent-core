package lesson1.c_1_1.c_1_1_6;

/**
 * Created by cch
 * 2018-05-10 16:19.
 */

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        MyThread firstThread = new MyThread(service);
        firstThread.start();

        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < 4; i++) {
            threadArray[i] = new MyThread(service);
            threadArray[i].start();

        }
    }
}
