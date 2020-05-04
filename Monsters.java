package com.example.Characters;

import java.util.ArrayList;

public class Monsters extends Characters {
    public static Monsters getMonster() {
        // create the monster objects
        Monsters goblin = new Monsters();
        Monsters orc = new Monsters();
        Monsters manticore = new Monsters();
        Monsters dragon = new Monsters();

        // assign names to the monster objects
        // assign random integers to the monster skills
        goblin.name = "Goblin";
        goblin.skill = random(5, 10);
        orc.name = "Orc";
        orc.skill = random(7, 12);
        manticore.name = "Manticore";
        manticore.skill = random(9, 14);
        dragon.name = "Dragon";
        dragon.skill = random(11, 16);

        // create a list of the monsters
        ArrayList<String> monsters = new ArrayList<String>();
        monsters.add(goblin.name);
        monsters.add(orc.name);
        monsters.add(manticore.name);
        monsters.add(dragon.name);

        // randomly choose a monster
        int randomNumber = random(0, 4);
        String chosenMonster = monsters.get(randomNumber);

        // create an object using the above random choice
        Monsters enemy = new Monsters();
        if (chosenMonster.equals("Goblin")) {
            enemy = goblin;
        } else if(chosenMonster.equals("Orc")) {
            enemy = orc;
        } else if(chosenMonster.equals("Manticore")) {
            enemy = manticore;
        } else if(chosenMonster.equals("Dragon")) {
            enemy = dragon;
        }
        // return the chosen monster
        return enemy;
    }

    }
