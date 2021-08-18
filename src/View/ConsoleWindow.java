package View;

import Model.Response;

import javax.swing.*;

public class ConsoleWindow {

    public void printResponse(Response response){
        JOptionPane.showMessageDialog(null, response.toString());
    }
}
