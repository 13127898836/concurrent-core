package lesson3.c_3_6;

import java.util.concurrent.Phaser;

/**
 * Description:register 能增加 parties 的值
 * Author: Hank
 * Date: 2018/5/25 19:30
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(5);
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());
    }
}
