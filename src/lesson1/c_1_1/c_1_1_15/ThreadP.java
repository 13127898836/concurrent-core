package lesson1.c_1_1.c_1_1_15;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:01
 */

public class ThreadP extends Thread {
    private RepastService service;

    public ThreadP(RepastService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
