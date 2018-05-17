package lesson2.c_2_2.c_2_2_1;

import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:44
 */

public class Test {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("全来了");
            }
        });
        for (int i = 0; i < 4; i++) {
            ThreadA threadA = new ThreadA(cbRef);
            threadA.start();
            Thread.sleep(1000);
        }
    }
}
