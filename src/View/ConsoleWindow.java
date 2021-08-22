package View;

import Controller.Controller;
import Model.ReturnType;

import java.util.Scanner;

public class ConsoleWindow {

    Controller controller;
    Scanner scanner = new Scanner(System.in);

    public ConsoleWindow(Controller controller) {
        this.controller = controller;
        askForInput();
    }

    public void askForInput() {
        System.out.println("Welcome to the generator. What type of random would you like? \n 1. Phone.\n To quit press 0");
        int inputType = scanner.nextInt();
        while(inputType!=0) {
            System.out.println("How many?");
            int quantityInput = scanner.nextInt();
            if (inputType == 1) {
                controller.getRandom(ReturnType.Phone, quantityInput);
            }
        }
        System.out.println("Welcome back");
    }
}
