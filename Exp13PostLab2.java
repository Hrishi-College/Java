/*  
    NAME : HRISHI PATIL
    UIN : 231P080
    ROLL NO : 26
    EXP13 : Drawing Human Face Using Applet
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Exp13PostLab2 extends Applet {
    public void paint(Graphics g) {
        // Circle
        g.drawOval(50, 50, 100, 100);

        // Filled Circle
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);
    }
}
