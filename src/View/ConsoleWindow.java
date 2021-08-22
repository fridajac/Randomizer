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
        ReturnType returnType = null;
        System.out.println("Welcome to the generator. What type of random would you like? \n 1. Phone.\n 2. Name \n To quit press 0");
        int inputType = scanner.nextInt();
        while(inputType!=0) {
            System.out.println("How many?");
            int quantityInput = scanner.nextInt();
            if (inputType == 1) {
                returnType = ReturnType.Phone;
                controller.getRandom(ReturnType.Phone, quantityInput);
            }
            if(inputType == 2){
                returnType = ReturnType.Name;
            }
            controller.getRandom(returnType, quantityInput);
        }
        System.out.println("Welcome back");
    }
}
