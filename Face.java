
/* WAP to display Human face using applet */
import java.awt.*;
import java.applet.*;
/* <applet CODE="Face.class" WIDTH=200 HEIGHT=200>
</applet>

*/

@SuppressWarnings("removal")
public class Face extends Applet {
    public void paint(Graphics g) {
        g.drawOval(40, 40, 120, 150); // head
        g.drawOval(57, 75, 30, 20); // left eye
        g.setColor(Color.red);
        g.drawOval(110, 75, 30, 20); // right eye
        Color c = new Color(0, 0, 0);
        g.setColor(c);

        g.fillOval(68, 81, 10, 10); // pupil (left)
        g.fillOval(121, 81, 10, 10); // pupil( right)
        g.drawOval(85, 100, 30, 30); // nose
        Color d = new Color(255, 175, 175);

        g.setColor(d);

        g.fillArc(60, 125, 80, 40, 180, 180); // mouth

        g.setColor(Color.black);

        g.drawOval(25, 92, 15, 30); // left ear
        g.drawOval(160, 92, 15, 30); // right ear
        Font f = new Font("TimesRoman", Font.BOLD, 72);

        g.setFont(f);
        g.drawString("Face ", 70, 250);
    }
}