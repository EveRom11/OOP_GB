package Seminars.units;

import java.util.Random;

public abstract class BaseHero { //общие свойства абстрактного класса. описывают всех сразу и никого конкретно
    public String name;
    float hp, maxHp; // здоровье и максимальное здоровье, чтобы Монах не мог перелечить
    protected int x,y; // положение перса на доске
    int atk; //атака
    protected int def; // защита
    int[] damage; // урон от мин.показателя до макс.показателя
    String class_name;// название класса
    int[] evasion; // уклонение от мин.показателя до макс.показателя
    int[] initiative; // инициатива, от которой зависит порядок хода. Определяется в начале раунда случайным числом
    String weapon;


    public BaseHero(String name, float hp, int x, int y, int atk, int def, int[] damage,String class_name,int[] evasion,String weapon, int[] initiative) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.x = x;
        this.y = y;
        this.atk = atk;
        this.def = def;
        this.damage = damage;
        this.class_name=class_name;
        this.evasion=evasion;
        this.weapon=weapon;
        this.initiative=initiative;

    }
public String toString(){
    return class_name + " " + name + " "+ hp + " " + atk + " "+weapon+" ";
}


}
