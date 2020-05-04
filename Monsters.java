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
        ArrayList<Monsters> hillMonsters = new ArrayList<Monsters>();
        monsters.add(goblin);
        monsters.add(orc);
        monsters.add(manticore);
        monsters.add(dragon);

        // randomly choose a monster and return it
        int randomNumber = random(0, 4);
        return hillMonsters.get(randomNumber);
    }
    
    // define a method to return a random woods monster
    public static Monsters getWoodMonster() {
        Monsters darkElf = new Monsters();
        Monsters woodGolem = new Monsters();
        Monsters evilSprite = new Monsters();
        Monsters hungryGhoul = new Monsters();
        
        // assign names and skill levels to the monsters
        darkElf.name = "Dark Elf";
        darkElf.skill = random(5, 10);
        woodGolem.name = "Wood Golem";
        woodGolem.skill = random(7, 12);
        evilSprite.name = "Evil Sprite";
        evilSprite.skill = random(9, 14);
        hungryGhoul.name = "Hungry Ghoul";
        hungryGhoul.skill = random(11, 16);
        
        // create a list to store the monsters in
        ArrayList<Monsters> woodMonsters = new ArrayList<Monsters>();
        woodMonsters.add(darkElf);
        woodMonsters.add(woodGolem);
        woodMonsters.add(evilSprite);
        woodMonsters.add(hungryGhoul);
        
        // choose and return a random monster
        int randomNumber = random(0, 4);
        return woodMonsters.get(randomNumber);
    }
