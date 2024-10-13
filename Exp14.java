/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP14 : Find Square of a Given Number Using Applet
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("removal")
public class Exp14 extends Applet implements ActionListener {
    Label label;
    TextField textField;
    Button button;
    
    public void init() {
        label = new Label("Enter a number:");
        textField = new TextField(10);
        button = new Button("Find Square");
        
        add(label);
        add(textField);
        add(button);
        
        button.addActionListener(this);  // Register the ActionListener
    }
    
    public void actionPerformed(ActionEvent e) {
        int number = Integer.parseInt(textField.getText());
        int square = number * number;
        showStatus("Square of " + number + " is: " + square);
    }
}
