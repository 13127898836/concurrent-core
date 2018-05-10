package lesson1.c_1_2.c_1_2_1;

import java.util.concurrent.Exchanger;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:42
 */

public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA a = new ThreadA(exchanger);
        a.start();
        System.out.println("main end");
    }
}
