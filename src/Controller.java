import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Point;

public class Controller implements MouseListener, MouseMotionListener, ActionListener {

    String mode;
    ImagePanel imagePanel;
    MenuPanel menuPanel;
    Point lastMousePress;
    Area area;

    Controller(MenuPanel menuPanel, ImagePanel imagePanel) {
        this.menuPanel = menuPanel;
        this.imagePanel = imagePanel;
        this.mode = menuPanel.radioDraw.getActionCommand();

        this.area = new Area(30, 20);
        area.clearData();
        area.drawRect(0, 0, this.area.width, this.area.height, 1);
        this.imagePanel.setImage(area.getData());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (mode == "Draw") {
            Point mousePoint = e.getPoint();
            int x = (int)(mousePoint.x * this.area.width) / imagePanel.width;
            int y = (int)(mousePoint.y * this.area.height) / imagePanel.height;
            System.out.println(x);
            System.out.println(y);
            System.out.println(mousePoint.x);
            System.out.println(mousePoint.y);
            area.setPoint(x, y, 1);
            this.imagePanel.setImage(area.getData());
            this.imagePanel.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.mode = e.getActionCommand();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
