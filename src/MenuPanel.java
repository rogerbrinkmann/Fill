import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import javax.swing.ButtonGroup;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel {

    public JRadioButton radioFill;
    public JRadioButton radioDraw;
    public ButtonGroup buttonGroup;
    

    MenuPanel() {
        this.setPreferredSize(new Dimension(800, 30));
        this.radioFill = new JRadioButton("Fill");
        this.radioDraw = new JRadioButton("Draw");
        this.radioDraw.setSelected(true);

        this.buttonGroup = new ButtonGroup();
        this.buttonGroup.add(radioFill);
        this.buttonGroup.add(radioDraw);

        this.add(radioFill);
        this.add(radioDraw);
    }
}
