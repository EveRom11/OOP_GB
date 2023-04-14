package Seminars.units;

public final class Archer extends BaseHero{
    int arrows; // кол-во стрел
    int accuracy; //точность в %
    int consumption; //расход за ход
    public Archer(String name) {
        super(name, 25, 2, 4, 9, 2,new int[] {3,10},
                "Лучник",new int[]{5,15},"Стрелы", new int[]{0,20});
        arrows=15;
        accuracy=50;
        consumption=1;
    }
}
