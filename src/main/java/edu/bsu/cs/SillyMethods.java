package edu.bsu.cs;

public class SillyMethods {

    public boolean didGuess42(int guess) {
        if (guess == 42) {
            return true;
        } else {
            return false;
        }
    }

    public String countTo(int amount) {
        String result = "";
        for (int i = 0; i < amount; i++) {
            result += i + " ";
        }
        return result += amount;
    }

}
