package Seminars;

import static java.lang.Float.NaN;

public enum SpellBook {
    healOne(1,-1), healFive(2,-5),healTen(3,-10),
    damageOne(1,1), damageFive(5,2), damageTen(10,3),
    ressurect(25, Float.NaN);

private final float cost, power;

    SpellBook(float cost, float power) {
        this.cost=cost;
        this.power=power;
    }
    public float getPower(){return power;}
    public float getCost(){return cost;}

}
