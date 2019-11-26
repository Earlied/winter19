package main.ua.training;

import main.ua.training.controller.Controller;
import main.ua.training.model.Model;
import main.ua.training.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());

        controller.processUser();
    }

}
