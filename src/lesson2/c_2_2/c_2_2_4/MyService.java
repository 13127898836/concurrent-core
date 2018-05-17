package lesson2.c_2_2.c_2_2_4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Description:
 * Author: Hank
 * Date: 2018/5/17 17:05
 */

public class MyService {
    private CyclicBarrier cbRef;

    public MyService(CyclicBarrier cbRef) {
        this.cbRef = cbRef;
    }

    public void beginRun(int count){
        try{
            System.out.println(Thread.currentThread().getName()+" 到了 在等其他人一起开始跑");
            if(Thread.currentThread().getName().equals("Thread-2")){
                System.out.println("thread-2 进来了");
                Thread.sleep(5000);
                Thread.currentThread().interrupt();
            }
            cbRef.await();
            System.out.println("都到了，开始跑！");
            System.out.println(Thread.currentThread().getName()+" 到达终点，并结束第"+count+" 阶段");
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (BrokenBarrierException e){
            e.printStackTrace();
        }
    }

    public void testA(){
        for (int i =0;i<1;i++){
            beginRun(i+1);
        }
    }
}
