package com.eatanapple.footballscoretracker.utils;

public class ScoreKeeperUtils {

    public static boolean isInputValid(String userInput) {
        return !userInput.isEmpty() && userInput.trim().length() != 0 && userInput != null;
    }

}
