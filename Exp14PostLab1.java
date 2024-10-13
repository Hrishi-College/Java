/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP14 : Implement Calculator Using ActionListener
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("removal")
public class Exp14PostLab1 extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button add, subtract, multiply, divide;
    
    public void init() {
        num1 = new TextField(5);
        num2 = new TextField(5);
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");
        
        add(num1);
        add(num2);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(result);
        
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int res = 0;

        if (e.getSource() == add) {
            res = n1 + n2;
        } else if (e.getSource() == subtract) {
            res = n1 - n2;
        } else if (e.getSource() == multiply) {
            res = n1 * n2;
        } else if (e.getSource() == divide) {
            res = n1 / n2;
        }
        
        result.setText("Result: " + res);
    }
}
