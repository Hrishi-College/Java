/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP14 : Find Largest Between Three Numbers Using Applet
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Exp14PostLab2 extends Applet implements ActionListener {
    TextField num1, num2, num3, result;
    Button findLargest;
    
    public void init() {
        num1 = new TextField(5);
        num2 = new TextField(5);
        num3 = new TextField(5);
        result = new TextField(10);
        result.setEditable(false);
        
        findLargest = new Button("Find Largest");
        
        add(num1);
        add(num2);
        add(num3);
        add(findLargest);
        add(result);
        
        findLargest.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());
        
        int largest = Math.max(n1, Math.max(n2, n3));
        result.setText("Largest: " + largest);
    }
}
