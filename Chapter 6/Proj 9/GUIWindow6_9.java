import javax.swing.*;
import java.awt.*;

public class GUIWindow6_9
{
    public static void main (String[] args) {
        JFrame theGUI = new JFrame();
        theGUI.setTitle("GUI Program");
        theGUI.setSize(1000, 800);
        theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Project6_9 thing = new Project6_9(Color.white, 50, 50);
        Container pane = theGUI.getContentPane();
        pane.add(thing);
        theGUI.setVisible(true);
}
}
