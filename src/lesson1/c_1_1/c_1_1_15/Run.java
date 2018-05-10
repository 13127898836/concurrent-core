package lesson1.c_1_1.c_1_1_15;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:01
 */

public class Run {
    public static void main(String[] args) throws InterruptedException {
        RepastService repastService = new RepastService();
        ThreadP[] arrP = new ThreadP[50];
        ThreadC[] arrC = new ThreadC[50];
        for (int i = 0; i < 50; i++) {
            arrP[i] = new ThreadP(repastService);
            arrP[i].setName("生产者"+i);
            arrC[i] = new ThreadC(repastService);
            arrC[i].setName("消费者"+i);
        }
        Thread.sleep(1000);
        for (int i = 0; i < 50; i++) {
            arrP[i].start();
            arrC[i].start();
        }
    }
}
