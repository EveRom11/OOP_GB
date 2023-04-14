package Seminars;


import Seminars.units.*;

import java.util.ArrayList;

public class Project {


    public static void main(String[] args) {

        ArrayList<BaseHero> hero= new ArrayList<>(); //список хранит в себе экземпляры класса BaseHero и его наследников,
        // таких как Sniper и тд.
        hero.add(new Sniper("Иван"));
        hero.add(new Archer("Лёха"));
        hero.add(new Magician("Елизавета"));
        hero.add(new Spearman("Анатолич"));
        hero.add(new Thief("Жулик"));
        hero.add(new Peasant("Виталик"));
        hero.add(new Monk("Авицена"));



        hero.forEach(n-> System.out.println(n));
    }
}
