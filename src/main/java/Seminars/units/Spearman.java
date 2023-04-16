package Seminars.units;

public final class Spearman extends BaseHero{
    public Spearman(String name) {
        super( 70, 5, 5, 19, 6, new int[]{9,23},
                 new int[]{0,5}, "Алебарда", new int[]{0,20});
    }
    @Override
    public String getInfo(){
        return "Я Алебардщик";}
}
