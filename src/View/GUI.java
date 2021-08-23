package View;

import Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class GUI implements IUserInterface {

    private Controller controller;

    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(3,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Generator");
        frame.setVisible(true);
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(300, 150));
        frame.add(panel, BorderLayout.WEST);
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;

    }
}
