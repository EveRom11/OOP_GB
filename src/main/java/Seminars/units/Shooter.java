package Seminars.units;

public abstract class Shooter extends BaseHero{ // класс всех дальников, наследник BaseHero
    int arrows, maxArrows; // кол-во стрел
    int accuracy; //точность в %
    int consumption; //расход за ход

    public Shooter( float hp, int x, int y, int atk, int def, int[] damage,
                   int[] evasion, String weapon,
                   int[] initiative,int arrows,int accuracy,int consumption) {
        super( hp, x, y, atk, def, damage, evasion, weapon,
                initiative);

        this.arrows=arrows;
        this.maxArrows=arrows;
        this.accuracy=accuracy;
        this.consumption=consumption;
    }

    @Override
    public String step() {
        return "Пиу- пиу- пиу!";
    };

}
