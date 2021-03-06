import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
    private ImageIcon image;

    public ColorPanel(Color backColor, ImageIcon i) {
        setBackground(backColor);
        image = i;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (getWidth() - image.getIconWidth() / 2);
        int y = (getHeight() - image.getIconHeight() / 2);
        image.paintIcon(this, g, x, y);
    }
}
