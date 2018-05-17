package lesson2.c_2_2.c_2_2_2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 16:47
 */

public class ThreadA extends Thread {
    private CyclicBarrier cbRef;

    public ThreadA(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    @Override
    public void run() {
        try {
            cbRef.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
