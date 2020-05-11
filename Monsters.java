package com.example.Characters;

import java.util.ArrayList;

public class Monsters extends Characters {
    // define constructor for monsters
    Monsters(String monsterName, int monsterSkill, int monsterStamina, String monsterElement) {
        name = monsterName;
        skill = monsterSkill;
        stamina = monsterStamina;
        element = monsterElement;
    }
    
    // define a method to return a random hill monster
    public static Monsters getHillMonster() {
        // create the monster objects
        Monsters goblin = new Monsters("Goblin", random (5, 10), random (5, 8),
                "water");
        Monsters orc = new Monsters("Orc", random (6, 11), random (6, 9),
                "earth");
        Monsters manticore = new Monsters("Manticore", random (7, 12), random (7, 10),
                "metal");
        Monsters dragon = new Monsters("Dragon", random (9, 14), random (9, 12),
                "fire");
        Monsters troll = new Monsters("Troll", random (8, 13), random (8, 11),
                "wood");
        
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
        Monsters darkElf = new Monsters("Dark Elf", random(5, 10), random(5, 8),
                "earth");
        Monsters lostGhost = new Monsters("Lost Ghost", random(6, 11), random(6, 9),
                "water");
        Monsters woodGolem = new Monsters("Wood Golem", random(7, 12), random(7, 10),
                "wood");
        Monsters evilSprite = new Monsters("Evil Sprite", random(9, 14), random(9, 12),
                "fire");
        Monsters hungryGhoul = new Monsters("Hungry Ghoul", random(8, 13), random(8, 11),
                "metal");

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
