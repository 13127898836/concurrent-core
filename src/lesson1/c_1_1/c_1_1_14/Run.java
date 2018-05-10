package lesson1.c_1_1.c_1_1_14;

/**
 * @Description:
 * Author: Hank
 * Date: 2018/5/10 17:37
 */

public class Run {
    public static void main(String[] args) {
        ListPool listPool = new ListPool();
        MyThread[] myThreads = new MyThread[12];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread(listPool);
        }
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i].start();
        }

    }
}
