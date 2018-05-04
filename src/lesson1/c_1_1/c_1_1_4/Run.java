package lesson1.c_1_1.c_1_1_4;

/**
 * Created by cch
 * 2018-05-04 15:10.
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
        Thread.sleep(2000);
        threadB.interrupt();
        System.out.println("main 中断了b");
    }
}
