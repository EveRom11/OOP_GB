package Seminars.units;

public final class Peasant extends BaseHero {
    int handR;
    int handL;
    public Peasant(String name) {
        super(name, 15, 3, 1, 5, 3, new int[]{0,3},
                "Крестьянин", new int[]{0,7}, "Камни и голые руки", new int[]{0,20});
        handR=3;
        handL=3;
    }
}
