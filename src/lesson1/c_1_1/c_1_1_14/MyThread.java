package lesson1.c_1_1.c_1_1_14;

/**
 * @Description: ${todo}
 * Author: Hank
 * Date: 2018/5/10 17:35
 */

public class MyThread extends Thread {
    private ListPool listPool;

    public MyThread(ListPool listPool) {
        this.listPool = listPool;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String getString = listPool.get();
            System.out.println(Thread.currentThread().getName()+" 取得值 "+getString);
            listPool.put(getString);
        }
    }

}
