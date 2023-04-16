package Seminars.units;

public final class Archer extends Shooter{
    public Archer(String name) {
        super( 25, 2, 4, 9, 2,new int[] {3,10},new int[]{5,15},"Стрелы", new int[]{0,20},
                15, 60, 1);
    }
    @Override
    public String getInfo(){
        return "Я Лучник";}
}
