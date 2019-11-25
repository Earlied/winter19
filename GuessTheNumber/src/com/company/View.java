package com.company;

import java.util.List;

public class View {

    public static final String INPUT_PROMPT
            = "Enter a number: ";
    public static final String WRONG_INPUT_MESSAGE
            = "Wrong input. Please try again. ";
    public static final String WRONG_RANGE_MESSAGE
            = "Number is not in the specified range. Please try again. ";
    public static final String PREVIOUS_USER_INPUTS = "Input history: ";
    public static final String NUMBER_RANGE
            = "I am thinking of a number between ";
    public static final String WIN_MESSAGE
            = "This is the correct answer.";
    public static final String USER_NUMBER_TOO_HIGH_MESSAGE
            = "Lower! ";
    public static final String USER_NUMBER_TOO_LOW_MESSAGE
            = "Higher! ";
    public static final String USER_INPUT_HISTORY = "User input history: ";
    public static final String SEPARATOR = " - ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInputs(List<String> userInputs) {
        for (String record : userInputs) {
            printMessage(record);
        }
    }
}
