package Seminars.units;

public final class Sniper extends Shooter{
    public Sniper(String name){
        super(30, 1, 6, 12, 3, new int[]{5,15}
                ,new int[]{5,10},"Болты", new int[]{0,20},
                10, 75, 1);
    }



    @Override
    public String getInfo(){
        return "Я Арбалетчик";
    }

}
