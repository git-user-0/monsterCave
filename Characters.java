package com.example.Characters;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Characters {
    // declare variables to be used by characters
    String name;
    String element;
    boolean mage;
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
    
    // define a method to display battle attributes
    public static void displayBattle(String displayName, int displaySkill, int displayStamina) {
        System.out.println("\n\n" + displayName + "\tSkill: " + displaySkill + "\tStamina: " +
                displayStamina);
    }
        
    // define a method to have the player and monster fight
    static void fight (int mSkill, int mHealth, String mName) {
        int pAttack;
        int mAttack;
        while (true) {
            pAttack = player.skill;
            mAttack = mSkill;
            pAttack += random(1, 7);
            mAttack += random(1, 7);
            if (pAttack >= mAttack) {
                mHealth -= 2;
                System.out.format("%n%nYour attack strength is: %d", pAttack);
                System.out.format("%n%s attack strength is %d", mName, mAttack);
                if (mHealth < 1) {
                    System.out.format("%n%nWell done - you have defeated the %s", mName);
                    return;
                }
                System.out.format("%n%n%s Stamina: %d", player.name, player.stamina);
                System.out.format("%n%s Stamina: %d", mName, mHealth);
            } else {
                player.stamina -= 2;
                System.out.format("%n%nYour attack strength is: %d", pAttack);
                System.out.format("%n%s attack strength is %d", mName, mAttack);
                if (player.stamina < 1) {
                    System.out.format("%n%nSadly, you have been defeated - your quest ends here!");
                    return;
                }
                System.out.format("%n%n%s Stamina: %d", player.name, player.stamina);
                System.out.format("%n%s Stamina: %d", mName, mHealth);
            }
            System.out.format("%nPress enter to continue...");
            kb.nextLine();
        }
    }
    
    // define a method for the spell: FIREBALL
    static int fireBall (String mName, String mElement) {
        int fireDamage = 0;
        if (mElement.equals("wood") | mElement.equals("fire")) {
            System.out.format("%nA ball of blazing hot fire shoots from your hands!");
            System.out.format("%nThe %s absorbs the fire energy and grows stronger!",
                    mName);
            fireDamage += random(-3, -1);
        } else if (mElement.equals("metal")) {
            System.out.format("%nA ball of blazing hot fire shoots from your hands!");
            System.out.format("%nYou chose well!");
            fireDamage += random(3, 5);
        } else {
            System.out.format("%nA ball of blazing hot fire shoots from your hands!");
            fireDamage += random(1, 3);
        }
    return fireDamage;
    }

    // define a method for the spell: ICEBALL
    static int iceBall (String mName, String mElement) {
        int iceDamage = 0;
        System.out.format("%nA ball of freezing cold water shoots from your hands!");
        iceDamage += random(1, 3);
        System.out.println(iceDamage);
        return iceDamage;
    }

    // define a method for the spell: EARTHBALL
    static int earthBall (String mName, String mElement) {
        int earthDamage = 0;
        System.out.format("%nA ball of condensed earth energy shoots from your hands!");
        earthDamage += random(1, 3);
        return earthDamage;
    }

    // define a method for the spell: WOODBALL
    static int woodBall (String mName, String mElement) {
        int woodDamage = 0;
        System.out.format("%nA ball of condensed wood energy shoots from your hands!");
        woodDamage += random(1, 3);
        return woodDamage;
    }

    // define a method for the spell: METALBALL
    static int metalBall (String mName, String mElement) {
        int metalDamage = 0;
        System.out.format("%nA ball of molten metal shoots from your hands!");
        metalDamage += random(1, 3);
        return metalDamage;
    }
}
