package com.company;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int Number;
    private List<String> userInputs;
    private List<Integer> userNumbers;
    private int lowBound;
    private int topBound;

    public Model() {
        Number = (int) (Math.random() * 101);
        userInputs = new ArrayList<>();
        userNumbers = new ArrayList<>();
    }

    public int getNumber() {
        return Number;
    }

    public int getRangeLowBound() {
        return lowBound;
    }

    public int getRangeTopBound() {
        return topBound;
    }

    public List<String> getUserInputs() {
        return userInputs;
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

    public void setRangeLowBound(int rangeLowBound) {
        this.lowBound = rangeLowBound;
    }

    public void setRangeTopBound(int rangeTopBound) {
        this.topBound = rangeTopBound;
    }

    public void addUserInput(String userInput) {
        userInputs.add(userInput);
    }

    public void addUserNumber(int userNumber) {
        userNumbers.add(userNumber);
    }

}
