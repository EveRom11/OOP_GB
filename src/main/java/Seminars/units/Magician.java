package Seminars.units;

import java.util.ArrayList;

public final class Magician extends BaseHero{
    int mana; // кол-во маны
    int recoveryMana; // восстановление маны за ход участника команды
    int accuracy; //точность в %
    int[] consumption; //расход маны за ход

    public Magician(String name) {
        super( 45, 3, 3, 11, 3, new  int[] {3,13},
                new int[]{3,13},"Заклинания на урон", new int[]{0,20});
        mana = 120;
        recoveryMana=15;
        accuracy=100;
        consumption=new int[]{30,60};
    }
    @Override
    public String getInfo(){
        return "Я Маг";}
}
