package lesson2.c_2_2.c_2_2_5;

/**
 * Description:await(long timeout,TimeUnit unit)超时出现异常测试
 * Author: Hank
 * Date: 2018/5/17 17:30
 */

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
        MyThreadB b = new MyThreadB(myService);
        b.start();
    }
}
