package lesson3.c_3_9;

import java.util.concurrent.Phaser;

/**
 * Description:arrive()的功能 是使 getArriveParties +1 不等待 并且 到达上线会重置
 * Author: Hank
 * Date: 2018/5/25 19:47
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2){
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("到达了没通过！phase="+phase+" phaseRegister="+registeredParties);
                return super.onAdvance(phase, registeredParties);
            }
        };
        System.out.println("A1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());

        System.out.println("A2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());

        System.out.println("B1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());

        System.out.println("B2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());


        System.out.println("c1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("c1 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());


        System.out.println("c2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("c2 getPhase="+phaser.getPhase() +"getRegisteredParties="+phaser.getArrivedParties());


    }
}
