package lesson2.c_2_2.c_2_2_3;

import java.util.concurrent.CyclicBarrier;

/**
 * Description:用CyclicBarrier类实现阶段跑步比赛
 * Author: Hank
 * Date: 2018/5/17 16:58
 */

public class Test {
    public static void main(String[] args) {
        CyclicBarrier cbRef = new CyclicBarrier(2);
        MyService service = new MyService(cbRef);

        ThreadA threadA1 = new ThreadA(service);
        threadA1.setName("A");
        threadA1.start();

        ThreadA threadA2 = new ThreadA(service);
        threadA2.setName("B");
        threadA2.start();

        ThreadA threadA3 = new ThreadA(service);
        threadA3.setName("C");
        threadA3.start();

        ThreadA threadA4 = new ThreadA(service);
        threadA4.setName("D");
        threadA4.start();
    }
}
