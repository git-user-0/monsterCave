package com.example.Characters;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Characters {
    // declare variables to be used by characters
    String name;
    int I_SKILL;
    int skill;
    int I_STAMINA;
    int stamina;
    int I_LUCK;
    int luck;
    int I_SANITY;
    int sanity;
    int I_GOLD;
    int gold;
    
    // create a Scanner object to allow user input from the keyboard
    public static Scanner kb = new Scanner(System.in);

    // define a method to return a random integer
    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
    
    // create a Characters object for the player
    public static Characters player = new Characters();

    // define a method to give the player their attributes
    public static void attributes() {
        int n;
        n = random(7, 13);
        player.I_SKILL = n;
        player.skill = n;

        n = random(14, 24);
        player.I_STAMINA = n;
        player.stamina = n;

        n = random(7, 13);
        player.I_LUCK = n;
        player.luck = n;

        n = random(14, 24);
        player.I_SANITY = n;
        player.sanity = n;

        n = random(14, 25);
        player.I_GOLD = n;
        player.gold = n;
    }
    
    // define a method to display the player's attributes
    public static void displayAttributes() {
        System.out.println("\nSkill: " + player.skill + "\tStamina: " + player.stamina +
                "\t\tLuck: " + player.luck + "\t\tSanity: " + player.sanity);
    }
        
    // define a method to have the player and monster fight
    static void fight (int pAttack, int mAttack, String mName) {
        pAttack += random(1, 7);
        mAttack += random(1, 7);
        if (pAttack >= mAttack) {
            System.out.format("%n%nYour attack strength is: %d", pAttack);
            System.out.format("%n%s attack strength is %d", mName, mAttack);
            System.out.format("%n%nWell done - you have defeated the %s", mName);
        } else {
            System.out.format("%n%nYour attack strength is: %d", pAttack);
            System.out.format("%n%s attack strength is %d", mName, mAttack);
            System.out.format("%n%nSadly, you have been defeated - your quest ends here!");
        }
    }
}
