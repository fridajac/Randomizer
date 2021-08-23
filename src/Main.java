import Controller.Controller;
import View.ConsoleWindow;
import View.GUI;
import View.IUserInterface;

public class Main {

    public static void main(String[] args) {
        IUserInterface userInterface = new ConsoleWindow();
        Controller controller = new Controller(userInterface);
        userInterface.setController(controller);
    }
}
