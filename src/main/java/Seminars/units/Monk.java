package Seminars.units;

public final class Monk extends BaseHero{
    int mana; // кол-во маны
    int recoveryMana; // восстановление маны за ход участника команды
    int accuracy; //точность в %
    int[] consumption; //расход маны за ход
    public Monk(String name) {
        super(60, 3, 5, 17, 5, new int[]{6,16},
                 new int[]{6,13}, "Бафы себе и команде", new int[]{0,20});
        mana = 100;
        recoveryMana=10;
        accuracy=100;
        consumption=new int[]{20,50};
    }
    @Override
    public String getInfo(){
        return "Я Монах";}
}
