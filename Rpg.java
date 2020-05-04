package com.example.Characters;

public class Rpg extends Monsters {
    public static void main (String[] Arguments) {
        // create a player object and assign it a random skill level
        Characters player = new Characters();
        player.skill = random(7, 13);

        // create a Scanner object to allow user input from the keyboard
        Scanner kb = new Scanner(System.in);

        // main
        System.out.format("You leave the town and head along a dusty path. Soon, it starts to climb" +
                "%nslightly. You see that you could continue to follow it into the hills, or you" +
                "%ncould branch off to the west and make your way into a woodland. The hills are" +
                "%nrocky and have lots of hiding places for monsters, but the woods look dark and" +
                "%nalso filled with places for monsters to lurk!" +
                "%n%nWill you (a) climb into the cool hills or (b) wander into the shady woods? ");
        String choice = kb.nextLine();

        // use if and else if to move the game on according to the player's choice
        if(choice.equals("a")) {
            System.out.format("%nSoon, you feel the air grow cooler as you continue climbing into" +
                    "%nthe rocky hills. The sun is still high in the sky but it does not feel as warm" +
                    "%nas it did in the town. You smile as the change in temperature is welcome." +
                    "%n%nThen, you suddenly hear a noise and look to your right. A monster emerges" +
                    "%nafrom its ambush place behind a large rock! It blocks the path - you must fight" +
                    "%nit!");
            System.out.format("%n%nYour Skill: %d", player.skill);
            Monsters monster = getHillMonster();
            System.out.format("%n%n%s Skill: %d", monster.name, monster.skill);
            System.out.format("%n%nPress enter to start the fight!");
            kb.nextLine();

            // player and monster fight
            player.skill += random(1, 7);
            monster.skill += random(1, 7);
            if(player.skill > monster.skill) {
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nWell done - you have defeated the %s", monster.name);
            } else if(player.skill < monster.skill) {
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nSadly, you have been defeated - your quest ends here!");
            } else {
                player.skill += 1;
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nWell done - you have defeated the %s", monster.name);
            }// alternative choice
        } else if(choice.equals("b")) {
            System.out.format("%nAfter a short while, you smell the damp, green scent of the woods." +
                    "%nYou smile slightly as you enter the cool shadows cast by the thickly growing" +
                    "%ncanopy above you. Birds twitter and unseen animals move through the undergrowth." +
                    "%nYou are just beginning to think that you made the right decision, when you" +
                    "%nhear a loud noise to your left! Suddenly, a monster emerges from the bushes! It" +
                    "%nblocks the path = you must fight it!");
            System.out.format("%n%nYour Skill: %d", player.skill);
            Monsters monster = getWoodMonster();
            System.out.format("%n%n%s Skill: %d", monster.name, monster.skill);
            System.out.format("%n%nPress enter to start the fight!");
            kb.nextLine();

            // player and monster fight
            player.skill += random(1, 7);
            monster.skill += random(1, 7);
            if(player.skill > monster.skill) {
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nWell done - you have defeated the %s", monster.name);
            } else if(player.skill < monster.skill) {
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nSadly, you have been defeated - your quest ends here!");
            } else {
                player.skill += 1;
                System.out.format("%n%nYour attack strength is: %d", player.skill);
                System.out.format("%n%s attack strength is %d", monster.name, monster.skill);
                System.out.format("%n%nWell done - you have defeated the %s", monster.name);
            }
        }
    }

}
