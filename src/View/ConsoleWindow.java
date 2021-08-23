package View;

import Controller.Controller;
import Model.ReturnType;

import java.util.Scanner;

public class ConsoleWindow implements IUserInterface {

    Controller controller;
    Scanner scanner = new Scanner(System.in);

    public ConsoleWindow() {
        System.out.println("Welcome to the generator");
        askForInput();
    }

    public void askForInput() {
        int userChoice = -1;
        while(userChoice != 0) {
            System.out.println("\nWhat type of random would you like? \n 1. Phone.\n 2. Name \n 3. Address \n To quit press 0");
            userChoice = scanner.nextInt();
            if (userChoice != 0) {
                System.out.println("How many?");
                int wishedQuantity = scanner.nextInt();
                sendRequest(userChoice, wishedQuantity);
            }
        }
        System.out.println("Welcome back");
    }

    private void sendRequest(int userChoice, int wishedQuantity) {
        ReturnType returnType = null;
        switch (userChoice) {
            case 1:
                returnType = ReturnType.Phone;
                break;
            case 2:
                returnType = ReturnType.Name;
                break;
            case 3:
                returnType = ReturnType.Address;
            default:
                break;
        }
        controller.getRandom(returnType, wishedQuantity);
        printResponse("Svaret!");
    }

    private void printResponse(String response) {
        System.out.println(response);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
