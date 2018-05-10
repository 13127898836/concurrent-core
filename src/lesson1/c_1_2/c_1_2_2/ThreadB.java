package lesson1.c_1_2.c_1_2_2;

import java.util.concurrent.Exchanger;

/**
 * Description: Exchanger.exchange() 使用
 * Author: Hank
 * Date: 2018/5/10 19:40
 */

public class ThreadB extends Thread {
    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try{
            System.out.println("在线程B 中得到线程A的值="+exchanger.exchange("中国人B"));
            System.out.println("A end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
