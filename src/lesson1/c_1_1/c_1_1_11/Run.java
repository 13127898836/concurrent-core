package lesson1.c_1_1.c_1_1_11;


/**
 * Created by cch
 * 2018-05-10 16:39.
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b  = new ThreadB(service);
        b.start();
    }
}
