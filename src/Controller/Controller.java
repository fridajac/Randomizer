package Controller;

import Model.ReturnType;
import Services.ServiceHttpClient;
import View.ConsoleWindow;

public class Controller {

    private ServiceHttpClient serviceHttpClient;
    private ConsoleWindow consoleWindow;

    public Controller() {
       serviceHttpClient = new ServiceHttpClient();
       consoleWindow = new ConsoleWindow(this);
    }

    public void getRandom(ReturnType returnType, int quantity){
        switch (returnType){
            case Phone:
                serviceHttpClient.getResponse("https://randommer.io/api/Phone/Generate?CountryCode=SE&Quantity="+quantity);
        }
    }
}
