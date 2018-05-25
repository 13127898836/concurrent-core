package lesson3.c_3_7;

import java.util.concurrent.Phaser;

/**
 * Description:批量增加parties
 * Author: Hank
 * Date: 2018/5/25 19:33
 */

public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(10);
        System.out.println(phaser.getRegisteredParties());
    }
}
