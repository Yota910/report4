package jp.ac.uryukyu.ie.e205756;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test

    void attackWithWeponSkillTest(){
        int i;
        int defaultwarriorattack=10;
        Enemy slime = new Enemy("スライムもどき", 100, 100);
        Warrior sensi = new Warrior("戦士", 10, defaultwarriorattack);
        for(i=0;i<3;i++){
            int beffurhp=slime.hitPoint;
            sensi.attackWithWeponSkill(slime);
            int damage=beffurhp-slime.hitPoint;
            assertEquals(damage, (int)(defaultwarriorattack*1.5));
        }
    }
}    