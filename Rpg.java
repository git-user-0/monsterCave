package com.example.Characters;

public class Rpg extends Monsters {
    Rpg(String monsterName, int monsterSkill, int monsterStamina, String monsterElement) {
        super(monsterName, monsterSkill, monsterStamina, monsterElement);
    }

    // create the methods for each decision
    static void one () {
        System.out.format("You leave the town and head along a dusty path. Soon, it starts to climb" +
                "%nslightly. You see that you could continue to follow it into the hills, or you" +
                "%ncould branch off to the west and make your way into a woodland. The hills are" +
                "%nrocky and have lots of hiding places for monsters, but the woods look dark and" +
                "%nalso filled with places for monsters to lurk!" +
                "%n%nWill you (a) climb into the cool hills or (b) wander into the shady woods? ");
        String choice = kb.nextLine();

        // use if and else if to move the game on according to the player's choice
        if(choice.equals("a")) {
            two ();
        } else if (choice.equals("b")) {
            three ();
        }
    }

    static void two () {
        System.out.format("%nSoon, you feel the air grow cooler as you continue climbing into" +
                "%nthe rocky hills. The sun is still high in the sky but it does not feel as warm" +
                "%nas it did in the town. You smile as the change in temperature is welcome." +
                "%n%nThen, you suddenly hear a noise and look to your right. A monster emerges" +
                "%nfrom its ambush place behind a large rock! It blocks the path - you must fight" +
                "%nit!");
        System.out.format("%n%nPress enter to continue...");
        kb.nextLine();
        displayBattle(player.name, player.skill, player.stamina);
        Monsters monster = getHillMonster();
        displayBattle(monster.name, monster.skill, monster.stamina);

        // choice to use magic
        if (player.mage = true) {
            monster.stamina = spellChoice(monster.name, monster.skill, monster.stamina, monster.element);
        }

        // player and monster fight
        System.out.println("\nPress enter to begin your attack! ");
        kb.nextLine();
        fight(monster.skill, monster.stamina, monster.name);
        System.out.format("%n%nYou walk on...");
    }

    static void three () {
        System.out.format("%nAfter a short while, you smell the damp, green scent of the woods." +
                "%nYou smile slightly as you enter the cool shadows cast by the thickly growing" +
                "%ncanopy above you. Birds twitter and unseen animals move through the undergrowth." +
                "%nYou are just beginning to think that you made the right decision, when you" +
                "%nhear a loud noise to your left! Suddenly, a monster emerges from the bushes! It" +
                "%nblocks the path = you must fight it!");
        System.out.format("%n%nPress enter to continue...");
        kb.nextLine();
        displayBattle(player.name, player.skill, player.stamina);
        Monsters monster = getWoodMonster();
        displayBattle(monster.name, monster.skill, monster.stamina);

        // choice to use magic
        if (player.mage = true) {
            monster.stamina = spellChoice(monster.name, monster.skill, monster.stamina, monster.element);
        }

        // player and monster fight
        System.out.println("\nPress enter to begin your attack! ");
        kb.nextLine();
        fight(monster.skill, monster.stamina, monster.name);
        System.out.format("%n%nYou walk on...");
    }

    // main method
    public static void main (String[] Arguments) {
        // allow the user to input the name of their character
        player.mage = true;
        System.out.println("\nWhat will your character be called?\n");
        player.name = kb.nextLine();

        // main
        attributes();
        System.out.println("\n" + player.name + ", press enter to see your attributes...");
        kb.nextLine();
        displayAttributes();
        System.out.println("\nPress enter to begin your adventure...");
        kb.nextLine();
        one();
    }
}
