package Seminars.units;

import Seminars.Names;

import java.util.Random;

public abstract class BaseHero implements GameInterface{ //общие свойства абстрактного класса. описывают всех сразу и никого конкретно
    public String name;
    static float hp;
    float maxHp; // здоровье и максимальное здоровье, чтобы Монах не мог перелечить
    protected int x,y; // положение перса на доске
    static int atk; //атака
    protected int def; // защита
    int[] damage; // урон от мин.показателя до макс.показателя

    int[] evasion; // уклонение от мин.показателя до макс.показателя
    int[] initiative; // инициатива, от которой зависит порядок хода. Определяется в начале раунда случайным числом
    static String weapon;


    public BaseHero(float hp, int x, int y, int atk, int def, int[] damage,
                    int[] evasion,String weapon, int[] initiative) {
        this.name = getName();
        this.hp = hp;
        this.maxHp = hp;
        this.x = x;
        this.y = y;
        this.atk = atk;
        this.def = def;
        this.damage = damage;
        this.evasion=evasion;
        this.weapon =weapon;
        this.initiative=initiative;

    }

// означает, что метод объявлен где-то выше
    @Override
        public String step() {return "Что-то делает";}

    @Override
       public String getInfo() {return "";}

    @Override
        public String getName() {
            return Names.values()[new Random().nextInt(Names.values().length)].toString();}
    }
