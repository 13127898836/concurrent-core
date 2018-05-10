package lesson1.c_1_2.c_1_2_2;

import java.util.concurrent.Exchanger;

/**
 * Description: Exchanger.exchange() 使用
 * Author: Hank
 * Date: 2018/5/10 19:40
 */

public class ThreadA extends Thread {
    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try{
            System.out.println("在线程A 中得到线程B的值="+exchanger.exchange("中国人A"));
            System.out.println("A end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
