import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {

    BufferedImage img;
    static int WIDTH = 800;
    static int HEIGHT = 800;

    ImagePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.img = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        clearImage();
    }

    public void clearImage() {
        Graphics g = this.img.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.dispose();
    }

    public void drawLine(Point start, Point end) {
        Graphics g = this.img.getGraphics();
        g.setColor(Color.BLACK);
        g.drawLine(start.x, start.y, end.x, end.y);
        g.dispose();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.img, 0, 0, null);
    }
}
