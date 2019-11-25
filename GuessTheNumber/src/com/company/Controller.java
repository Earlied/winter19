package com.company;

import java.util.Scanner;

public class Controller {
    private static final int LOW_BOUND = 0;
    private static final int TOP_BOUND = 100;

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setRangeLowBound(LOW_BOUND);
        model.setRangeTopBound(TOP_BOUND);

        gameLogic(sc);
        view.printMessage(View.WIN_MESSAGE);
        view.printMessage(View.USER_INPUT_HISTORY);
        view.printInputs(model.getUserInputs());
    }

    private void gameLogic(Scanner scanner) {
        int userNumber;

        while (true) {
            view.printMessage(View.NUMBER_RANGE + model.getRangeLowBound()
                    + View.SEPARATOR + model.getRangeTopBound());
            userNumber = inputRangeCheck(scanner);
            model.addUserNumber(userNumber);

            if (userNumber == model.getNumber()) {
                break;
            } else if (userNumber < model.getNumber()) {
                model.setRangeLowBound(userNumber + 1);
                view.printMessage(View.USER_NUMBER_TOO_LOW_MESSAGE);
            } else {
                model.setRangeTopBound(userNumber - 1);
                view.printMessage(View.USER_NUMBER_TOO_HIGH_MESSAGE);
            }

            view.printMessage(View.PREVIOUS_USER_INPUTS);
            view.printMessage(model.getUserNumbers().toString());
        }
    }

    private int inputIntCheck(Scanner scanner) {
        String value;

        view.printMessage(View.INPUT_PROMPT);

        while ( !scanner.hasNextInt() ) {
            view.printMessage(View.WRONG_INPUT_MESSAGE);
            view.printMessage(View.INPUT_PROMPT);
            model.addUserInput(scanner.next());
        }

        value = scanner.next();
        model.addUserInput(value);

        return Integer.parseInt(value);
    }

    private int inputRangeCheck(Scanner scanner) {
        int value = inputIntCheck(scanner);

        while ( value < model.getRangeLowBound() || value > model.getRangeTopBound() ) {
            view.printMessage(View.WRONG_RANGE_MESSAGE);
            value = inputIntCheck(scanner);
        }

        return value;
    }

}
