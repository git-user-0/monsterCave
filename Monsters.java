package com.example.Characters;

import java.util.ArrayList;

public class Monsters extends Characters {
    // define a method to return a random hill monster
    public static Monsters getHillMonster() {
        // create the monster objects
        Monsters goblin = new Monsters();
        Monsters orc = new Monsters();
        Monsters manticore = new Monsters();
        Monsters dragon = new Monsters();
        Monsters troll = new Monsters();

        // assign names to the monster objects
        // assign random integers to the monster skills
        goblin.name = "Goblin";
        goblin.skill = random(5, 10);
        goblin.stamina = random(5, 8);
        goblin.element = "water";
        orc.name = "Orc";
        orc.skill = random(6, 11);
        orc.stamina = random(6, 9);
        orc.element = "earth";
        manticore.name = "Manticore";
        manticore.skill = random(7, 12);
        manticore.stamina = random(7, 10);
        manticore.element = "metal";
        troll.name = "Troll";
        troll.skill = random(8, 13);
        troll.stamina = random(8, 11);
        troll.element = "wood";
        dragon.name = "Dragon";
        dragon.skill = random(9, 14);
        dragon.stamina = random(9, 12);
        dragon.element = "fire";


        // create a list of the monsters
        ArrayList<Monsters> hillMonsters = new ArrayList<>();
        hillMonsters.add(goblin);
        hillMonsters.add(orc);
        hillMonsters.add(manticore);
        hillMonsters.add(troll);
        hillMonsters.add(dragon);

        // randomly choose a monster and return it
        int randomNumber = random(0, 5);
        return hillMonsters.get(randomNumber);
    }

    // define a method to return a random woods monster
    public static Monsters getWoodMonster() {
        Monsters darkElf = new Monsters();
        Monsters lostGhost = new Monsters();
        Monsters woodGolem = new Monsters();
        Monsters evilSprite = new Monsters();
        Monsters hungryGhoul = new Monsters();

        // assign names and skill levels to the monsters
        darkElf.name = "Dark Elf";
        darkElf.skill = random(5, 10);
        darkElf.stamina = random(5, 8);
        darkElf.element = "earth";
        lostGhost.name = "Lost Ghost";
        lostGhost.stamina = random(6, 9);
        lostGhost.skill = random(6, 11);
        lostGhost.element = "water";
        woodGolem.name = "Wood Golem";
        woodGolem.skill = random(7, 12);
        woodGolem.stamina = random(7, 10);
        woodGolem.element = "wood";
        evilSprite.name = "Evil Sprite";
        evilSprite.skill = random(9, 14);
        evilSprite.stamina = random(8, 11);
        evilSprite.element = "fire";
        hungryGhoul.name = "Hungry Ghoul";
        hungryGhoul.skill = random(11, 16);
        hungryGhoul.stamina = random(9, 12);
        hungryGhoul.element = "metal";

        // create a list to store the monsters in
        ArrayList<Monsters> woodMonsters = new ArrayList<>();
        woodMonsters.add(darkElf);
        woodMonsters.add(lostGhost);
        woodMonsters.add(woodGolem);
        woodMonsters.add(evilSprite);
        woodMonsters.add(hungryGhoul);

        // choose and return a random monster
        int randomNumber = random(0, 5);
        return woodMonsters.get(randomNumber);
    }
}
