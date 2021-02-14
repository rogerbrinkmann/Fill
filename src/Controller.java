import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    MenuPanel menuPanel;
    ImagePanel imagePanel;
    Area area;

    Controller(MenuPanel menuPanel, ImagePanel imagePanel){
        this.menuPanel = menuPanel;
        this.imagePanel = imagePanel;
        this.area = new Area();
        this.imagePanel.setImage(area.data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());

    }
    
}
