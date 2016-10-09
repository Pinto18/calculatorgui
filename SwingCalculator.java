import javax.swing.*;   
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator {

    public static void main(String[] args) {
        CalculatorGui cg = new CalculatorGui();
        
        cg.setSize(250,400);
        cg.setResizable(false);
        cg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cg.setVisible(true);
    }
}