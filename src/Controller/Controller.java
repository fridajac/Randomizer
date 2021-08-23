package Controller;

import Model.ReturnType;
import Services.ServiceHttpClient;
import View.IUserInterface;

public class Controller {

    private ServiceHttpClient serviceHttpClient;
    private IUserInterface userInterface;

    public Controller(IUserInterface userInterface) {
       serviceHttpClient = new ServiceHttpClient();
       this.userInterface = userInterface;
    }

    public void getRandom(ReturnType returnType, int quantity){
        switch (returnType){
            case Phone:
                serviceHttpClient.getResponse("https://randommer.io/api/Phone/Generate?CountryCode=SE&Quantity="+quantity);
                break;
            case Name:
                serviceHttpClient.getResponse("https://randommer.io/api/Name?nameType=firstname&quantity="+quantity);
            case Address:
                serviceHttpClient.getResponse("https://randommer.io/api/Misc/Random-Address?number="+quantity+"&culture=en");
        }
    }
}
