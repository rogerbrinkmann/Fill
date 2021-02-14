import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ImagePanel extends JPanel {

    BufferedImage img;
    int width;
    int height;

    ImagePanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setPreferredSize(new Dimension(this.width, this.height));
        this.img = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
    }

    public void setImage(int[][] data) {
        int rows = data.length;
        int columns = data[0].length;
        int rectWidth = this.width / columns;
        int rectHeight = this.height / rows;

        Graphics g = this.img.getGraphics();

        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[0].length; x++) {
                if (data[y][x] == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x * rectWidth, y * rectHeight, rectWidth, rectHeight);
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.img, 0, 0, null);
    }
}
