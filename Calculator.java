import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    // Variables
    JLabel l1;
    JTextField t1;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, bC, bClear, bSqr, bDiv, bMult, bSub, bAdd, b0, bDot, bEqual;

    // Comstructors
    public Calculator() { }
    public Calculator(String s){
        super(s);
    }

    public void setComponents(){
        // Level of components
        l1 = new JLabel("Calculator pkumar.link");
        t1 = new JTextField();
        bC = new JButton("C");
        bClear = new JButton("<-");
        bSqr = new JButton("Sqr");
        bDiv = new JButton("/");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bMult = new JButton("*");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bSub = new JButton("-");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bAdd = new JButton("+");
        b0 = new JButton("0");
        bDot = new JButton(".");
        bEqual = new JButton("=");

        // Set Layout is NULL
        setLayout(null);

        // Set position of components
        l1.setBounds(80, 5, 200, 20);
        t1.setBounds(25, 40, 240, 30);
        bC.setBounds(25, 70, 60, 40);
        bClear.setBounds(85, 70, 60, 40);
        bSqr.setBounds(145, 70, 60, 40);
        bDiv.setBounds(205, 70, 60, 40);
        b7.setBounds(25, 110, 60, 40);
        b8.setBounds(85, 110, 60, 40);
        b9.setBounds(145, 110, 60, 40);
        bMult.setBounds(205, 110, 60, 40);
        b4.setBounds(25, 150, 60, 40);
        b5.setBounds(85, 150, 60, 40);
        b6.setBounds(145, 150, 60, 40);
        bSub.setBounds(205, 150, 60, 40);
        b1.setBounds(25, 190, 60, 40);
        b2.setBounds(85, 190, 60, 40);
        b3.setBounds(145, 190, 60, 40);
        bAdd.setBounds(205, 190, 60, 40);
        b0.setBounds(25, 230, 60, 40);
        bDot.setBounds(85, 230, 60, 40);
        bEqual.setBounds(145, 230, 120, 40);

        // Event handling
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        b5.addActionListener(new Handler());
        b6.addActionListener(new Handler());
        b7.addActionListener(new Handler());
        b8.addActionListener(new Handler());
        b9.addActionListener(new Handler());
        bAdd.addActionListener(new Handler());
        bSub.addActionListener(new Handler());
        bMult.addActionListener(new Handler());
        bDiv.addActionListener(new Handler());
        bDot.addActionListener(new Handler());
        b0.addActionListener(new Handler());
        bClear.addActionListener(new Handler());
        bC.addActionListener(new Handler());
        bEqual.addActionListener(new Handler());
        bSqr.addActionListener(new Handler());

        // Add Components
        add(l1);
        add(t1);
        add(bC);
        add(bClear);
        add(bSqr);
        add(bDiv);
        add(b7);
        add(b8);
        add(b9);
        add(bMult);
        add(b4);
        add(b5);
        add(b6);
        add(bSub);
        add(b1);
        add(b2);
        add(b3);
        add(bAdd);
        add(b0);
        add(bDot);
        add(bEqual);
    }

    // Variables for calculations
    double num, ans;
    int calculation;

    // Event handler class
    class Handler implements ActionListener{
        
        // Arithematic Calculations Method
        public void arithematicOperator(){
            switch(calculation){
                case 1: // For Addition
                    ans = num + Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(ans));
                    break;
                case 2: // For Subtraction
                    ans = num - Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(ans));
                    break;
                case 3: // For Multiplication
                    ans = num * Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(ans));
                    break;
                case 4: // For Division
                    ans = num / Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(ans));
                    break;
                case 5: // For Square
                    ans = num * Double.parseDouble(t1.getText());
                    t1.setText(Double.toString(ans));
                    break;
            }
        }

        // Action of Event Method
        public void actionPerformed(ActionEvent e){
            Object source = e.getSource();
            if(source==b1){
                t1.setText(t1.getText()+"1");
            }else if(source==b2){
                t1.setText(t1.getText()+"2");
            }else if(source==b3){
                t1.setText(t1.getText()+"3");
            }else if(source==b4){
                t1.setText(t1.getText()+"4");
            }else if(source==b5){
                t1.setText(t1.getText()+"5");
            }else if(source==b6){
                t1.setText(t1.getText()+"6");
            }else if(source==b7){
                t1.setText(t1.getText()+"7");
            }else if(source==b8){
                t1.setText(t1.getText()+"8");
            }else if(source==b9){
                t1.setText(t1.getText()+"9");
            }else if(source==bDot){
                t1.setText(t1.getText()+".");
            }else if(source==b0){
                t1.setText(t1.getText()+"0");
            }else if(source==bAdd){
                num = Double.parseDouble(t1.getText());
                calculation = 1;
                t1.setText(""); 
                // System.out.println(num);
            }else if(source==bSub){ // Subtraction
                num = Double.parseDouble(t1.getText());
                calculation = 2;
                t1.setText(""); 
            }else if(source==bMult){ // Multiplication
                num = Double.parseDouble(t1.getText());
                calculation = 3;
                t1.setText(""); 
            }else if(source==bDiv){ // Division
                num = Double.parseDouble(t1.getText());
                calculation = 4;
                t1.setText(""); 
            }else if(source==bSqr){ // Square
                num = Double.parseDouble(t1.getText());
                calculation = 5;
                t1.setText(Double.toString(num));
            }else if(source==bEqual){
                // if(calculation==1){
                //     ans = num + Double.parseDouble(t1.getText());
                //     t1.setText(Double.toString(ans));
                //     System.out.println(num+" : "+ans);
                //     System.out.println("Prease = Button!");
                // }
                arithematicOperator();
            }
            else if(source==bClear){
                String x = t1.getText();
                int length = x.length();
                int number = length-1;
                String store;

                if(length>0){
                    StringBuilder back = new StringBuilder(t1.getText());
                    back.deleteCharAt(number);
                    store = back.toString();
                    t1.setText(store);
                }
            }else if(source==bC){
                t1.setText("");
            }
        }
    }

    // Mean Method
    public static void main(String[] args) {
        Calculator jf = new Calculator("Calculator"); // Create reference variable of Calculator class

        jf.setComponents();

        jf.setSize(300, 320);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
