package lesson2.c_2_2.c_2_2_4;

import java.util.concurrent.CyclicBarrier;

/**
 * Description: CyclicBarrier 对线程的中断处理 会使用全有或者全无的破坏模型 所有在屏障点的线程会抛出
 * BrokenBarrierException 或 InterruptedException
 * Author: Hank
 * Date: 2018/5/17 17:12
 */

public class Run
{
    public static void main(String[] args) {
        int parties = 4;
        CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了！");
            }
        });

        MyService myService = new MyService(cbRef);
        MyThread[] threadArray = new MyThread[4];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(myService);
            threadArray[i].start();
        }
    }
}
