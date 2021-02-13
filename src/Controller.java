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

    Controller(MenuPanel menuPanel, ImagePanel imagePanel) {
        this.menuPanel = menuPanel;
        this.imagePanel = imagePanel;
        this.mode = menuPanel.radioDraw.getActionCommand();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (mode == "Draw") {
            lastMousePress = e.getPoint();
        } else {
            imagePanel.fill(e.getPoint());
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
        if (this.mode == "Draw") {
            Point newMousePress = e.getPoint();
            imagePanel.drawLine(lastMousePress, newMousePress);
            this.lastMousePress = newMousePress;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
