package lesson3.c_3_5_1;

import java.util.concurrent.Phaser;

/**
 * Description:修改onAdvance 为true 会取消后面的屏障
 * Author: Hank
 * Date: 2018/5/25 19:18
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2){
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("onAdvance 被调用了");
                return false;
            }
        };

        MyService myService = new MyService(phaser);
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();

    }
}
