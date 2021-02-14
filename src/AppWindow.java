import javax.swing.JFrame;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class AppWindow extends JFrame {

    ImagePanel imagePanel;
    MenuPanel menuPanel;
    Controller controller;

    AppWindow() {
        this.setTitle("App");
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.imagePanel = new ImagePanel(800, 800);
        this.menuPanel = new MenuPanel(800, 30);
        this.controller = new Controller(this.menuPanel, this.imagePanel);

        this.menuPanel.radioFill.addActionListener(this.controller);
        this.menuPanel.radioDraw.addActionListener(this.controller);
        this.imagePanel.addMouseListener(this.controller);
        this.imagePanel.addMouseMotionListener(this.controller);

        this.add(this.imagePanel, BorderLayout.CENTER);
        this.add(this.menuPanel, BorderLayout.NORTH);

        this.setResizable(false);
        this.pack();
    }
}
