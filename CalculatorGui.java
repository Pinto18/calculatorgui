import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

public class CalculatorGui extends JFrame {
  
        JFrame frame = new JFrame("My Simple Calculator");
        JTextField answerField;
        JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, div, mul, equals;
        JPanel contentPanel;
        String stemp1="";
        double answer;
        
        // CalculatorGui default constructor - super long constructor
        public CalculatorGui() {
          super("My Simple Calculator");
          
          answerField = new JTextField(null, 20); 
          answerField.setEditable(false);
          
          one = new JButton("1"); two = new JButton("2"); three = new JButton("3"); four = new JButton("4");
          five = new JButton("5"); six = new JButton("6"); seven = new JButton("7"); eight = new JButton("8");
          nine = new JButton("9"); zero = new JButton("0");
          add = new JButton("+"); sub = new JButton("-"); div = new JButton("/"); mul = new JButton("*");
          equals = new JButton("=");
          
          Dimension dim =  new Dimension(75,25);
          
          // layout with specific dimension for each button
          one.setPreferredSize(dim); two.setPreferredSize(dim); three.setPreferredSize(dim); four.setPreferredSize(dim);
          five.setPreferredSize(dim); six.setPreferredSize(dim); seven.setPreferredSize(dim); eight.setPreferredSize(dim);
          nine.setPreferredSize(dim); zero.setPreferredSize(dim); add.setPreferredSize(dim); sub.setPreferredSize(dim);
          div.setPreferredSize(dim); mul.setPreferredSize(dim); equals.setPreferredSize(dim);
          
          // create a private class to handle events detected by an action listener
          Operations op = new Operations();
          ArgumentEnter arg = new ArgumentEnter();
          
          // Add a listener to each button to invoke a handler for arguments entered - yuck
          one.addActionListener(arg); two.addActionListener(arg); three.addActionListener(arg); four.addActionListener(arg);
          five.addActionListener(arg); six.addActionListener(arg); seven.addActionListener(arg); eight.addActionListener(arg);
          nine.addActionListener(arg); zero.addActionListener(arg); 
          
          // Add a different listener to each button to invoke an operation or evaluation handler - yuck again
          add.addActionListener(op); sub.addActionListener(op);
          div.addActionListener(op); mul.addActionListener(op); equals.addActionListener(op);
          
          contentPanel = new JPanel();
          contentPanel.setLayout(new FlowLayout());
          contentPanel.setBackground(Color.green);
          
          contentPanel.add(answerField, BorderLayout.NORTH);
          contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four);
          contentPanel.add(five); contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight);
          contentPanel.add(nine); contentPanel.add(zero); contentPanel.add(add); contentPanel.add(sub);
          contentPanel.add(div); contentPanel.add(mul); contentPanel.add(equals);
        
          // refers to this extended JFrame class
          this.setContentPane(contentPanel); 
        
        }
        
        private class Operations implements ActionListener {
          public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();
            
               if(src.equals(add)) {
                 stemp1 += "+";
               }
               if(src.equals(sub)) {
                 stemp1 += "-";
               }
               if(src.equals(div)) {
                 stemp1 += "/";
               }
               if(src.equals(mul)) {
                 stemp1 += "*";
               }
               if(src.equals(equals)) {
                 stemp1 += "=";
               }
            
               // debug output and GUI display update
               System.out.printf("Operation: stemp1=%s\n", stemp1);
               answerField.setText(stemp1);
          }
        }
        
        private class ArgumentEnter implements ActionListener {
             public void actionPerformed(ActionEvent event) {
               JButton src = (JButton) event.getSource();
               
               if(src.equals(one)) {
                 stemp1 += "1";
               }
               if(src.equals(two)) {
                 stemp1 += "2";
               }
               if(src.equals(three)) {
                 stemp1 += "3";
               }
               if(src.equals(four)) {
                 stemp1 += "4";
               }
               if(src.equals(five)) {
                 stemp1 += "5";
               }
               if(src.equals(six)) {
                 stemp1 += "6";
               }
               if(src.equals(seven)) {
                 stemp1 += "7";
               }
               if(src.equals(eight)) {
                 stemp1 += "8";
               }
               if(src.equals(nine)) {
                 stemp1 += "9";
               }
               if(src.equals(zero)) {
                 stemp1 += "0";
               }
               
               // debug output and GUI display update
               System.out.printf("Argument: stemp1=%s\n", stemp1);
               answerField.setText(stemp1);
          }
        }
}