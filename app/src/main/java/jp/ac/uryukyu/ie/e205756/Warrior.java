package jp.ac.uryukyu.ie.e205756;

public class Warrior extends Hero{

    public Warrior(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if(!dead){
            int damage=(int)(1.5*attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",name,opponent.getName(),damage);
            opponent.wounded(damage);
        }
    }
    
    
}