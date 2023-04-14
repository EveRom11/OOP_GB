package Seminars.units;

public final class Thief extends BaseHero{
    int herbBag; //сумка Вора с запасом ядовитых трав для отравленного клинка
    int consumption; // расход яд.трав за ход
    public Thief(String name) {
        super(name, 20, 2, 6, 10, 7, new int[]{9,25},
                "Вор", new int[]{15,30}, "Клинок вора", new int[]{0,20});
        herbBag=5;
        consumption=1;
    }
}
