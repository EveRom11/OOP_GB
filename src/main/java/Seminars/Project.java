package Seminars;


import Seminars.units.*;

import java.util.ArrayList;
import java.util.Random;

public class Project {


    public static void main(String[] args) {

        ArrayList<BaseHero> teamL = new ArrayList<>(); //список хранит в себе экземпляры класса BaseHero
        // и его наследников,
        // таких как Sniper и тд.

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    teamL.add(new Sniper(""));
                    break;
                case 1:
                    teamL.add(new Archer(""));
                    break;
                case 2:
                    teamL.add(new Magician(""));
                    break;
                case 3:
                    teamL.add(new Spearman(""));
                    break;
                case 4:
                    teamL.add(new Thief(""));
                    break;
                case 5:
                    teamL.add(new Peasant(""));
                    break;
                default:
                    teamL.add(new Monk(""));
            }
        }
        ArrayList<BaseHero> teamR= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    teamR.add(new Sniper(""));
                    break;
                case 1:
                    teamR.add(new Archer(""));
                    break;
                case 2:
                    teamR.add(new Magician(""));
                    break;
                case 3:
                    teamR.add(new Spearman(""));
                    break;
                case 4:
                    teamR.add(new Thief(""));
                    break;
                case 5:
                    teamR.add(new Peasant(""));
                    break;
                default:
                    teamR.add(new Monk(""));
            }
        }
        System.out.println("Команда 1:");
        teamL.forEach(n-> System.out.println(n.name+" "+n.getInfo()+" "+n.step()));
        System.out.println(" ");
        System.out.println("Команда 2:");
        teamR.forEach(n-> System.out.println(n.name+" "+n.getInfo()+" "+n.step()));

    };



}
