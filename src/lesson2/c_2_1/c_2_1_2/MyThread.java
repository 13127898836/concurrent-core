package lesson2.c_2_1.c_2_1_2;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/11 11:41
 */

public class MyThread extends Thread{
    private CountDownLatch maxRunner;

    public MyThread(CountDownLatch maxRunner) {
        this.maxRunner = maxRunner;
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            maxRunner.countDown();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
