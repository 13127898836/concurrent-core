package lesson1.c_1_1.c_1_1_15;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:04
 */

public class ThreadC extends Thread{
    private RepastService service;

    public ThreadC(RepastService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}
