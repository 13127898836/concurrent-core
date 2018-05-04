package lesson1.c_1_1.c_1_1_3;

/**
 * Created by cch
 * 2018-05-04 14:58.
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < 10; i++) {
            a[i]  = new ThreadA(service);
            a[i].start();
        }
    }
}
