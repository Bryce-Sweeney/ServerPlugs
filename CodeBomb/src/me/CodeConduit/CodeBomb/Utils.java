package me.CodeConduit.CodeBomb;

import org.bukkit.ChatColor;

public class Utils {
    //Method for ease of use color chat
    public static String chat(String a) {
        return ChatColor.translateAlternateColorCodes('&', a);
    }
    //Method for getting a random value between two points
    public static double random(double a, double b) {
        double randomValue;
        double randomMultiplier;
        double dummy;

        if (a >= b) {
            dummy = b;
            b = a;
            a = dummy;
        }

        randomMultiplier = b-a;
        randomValue = a + randomMultiplier*Math.random();

        return randomValue;
    }
}
