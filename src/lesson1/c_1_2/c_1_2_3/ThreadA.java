package lesson1.c_1_2.c_1_2_3;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:57
 */

public class ThreadA extends Thread {
    private Exchanger<String> exchanger = new Exchanger<>();

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try{
            System.out.println("在线程A获取线程B的值"+exchanger.exchange("中国人A",5,TimeUnit.SECONDS));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
