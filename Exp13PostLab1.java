/*  
NAME : HRISHI PATIL
UIN : 231P080
ROLL NO : 26
EXP13 : Drawing Human Face Using Applet
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

@SuppressWarnings("removal")
public class Exp13PostLab1 extends Applet {
public void paint(Graphics g) {
    // Normal Rectangle
    g.drawRect(50, 50, 100, 50);

    // Filled Rectangle
    g.setColor(Color.BLUE);
    g.fillRect(50, 150, 100, 50);

    // Round Rectangle
    g.setColor(Color.BLACK);
    g.drawRoundRect(200, 50, 100, 50, 20, 20);

    // Filled Round Rectangle
    g.setColor(Color.RED);
    g.fillRoundRect(200, 150, 100, 50, 20, 20);
}
}

