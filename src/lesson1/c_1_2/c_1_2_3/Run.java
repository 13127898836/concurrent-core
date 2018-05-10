package lesson1.c_1_2.c_1_2_3;

import java.util.concurrent.Exchanger;

/**
 * Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 19:59
 */

public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        ThreadA threadA = new ThreadA(exchanger);
        threadA.start();
    }
}
