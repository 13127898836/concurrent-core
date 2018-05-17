package lesson2.c_2_2.c_2_2_1;

import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:35
 */

public class Run {
    public static void main(String[] args) {
        CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全都到了");
            }
        });
        MyThread[] threadArray = new MyThread[5];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(cbRef);
        }

        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i].start();
        }
    }
}
