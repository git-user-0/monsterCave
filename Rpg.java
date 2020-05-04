package com.example.Characters;

public class Rpg extends Monsters {
    public static void main (String[] Arguments) {
        Monsters chosenMonster = new Monsters ();
        chosenMonster = getMonster();
        System.out.format("You see a terrible monster!");
        System.out.format("%nYou must fight it!");
        System.out.format("%n%n%s %d", chosenMonster.name,
                chosenMonster.skill);
    }

}
