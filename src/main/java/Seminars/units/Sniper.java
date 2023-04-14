package Seminars.units;

public final class Sniper extends BaseHero{
    int arrows; // кол-во стрел
    int accuracy; //точность в %
    int consumption; //расход за ход
    public Sniper(String name) {
        super(name, 30, 1, 6, 12, 3, new int[]{5,15},
                "Снайпер",new int[]{5,10},"Болты", new int[]{0,20});
        arrows=10;
        accuracy=75;
        consumption=1;
    }
}
