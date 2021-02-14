import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Button;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel {

    int width;
    int height;
    Button button;

    MenuPanel(int width, int height) {
        this.width = width;
        this.height = height;
        this.setPreferredSize(new Dimension(this.width, this.height));

        this.button = new Button("Fill");
        this.add(button);
    }
}
