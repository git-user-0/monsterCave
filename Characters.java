package com.example.Characters;

import java.util.concurrent.ThreadLocalRandom;

public class Characters {
    // declare variables to be used by all characters
    String name;
    int skill;

    // define a method to return a random integer
    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
        
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
