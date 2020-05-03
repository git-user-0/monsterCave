package com.example.Characters;

import java.util.concurrent.ThreadLocalRandom;

public class Characters {
    // declare variables to be used by all characters
    String name;
    int skill;

    // define a method to return a random integer
    public static int random(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
