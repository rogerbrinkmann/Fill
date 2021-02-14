import javax.swing.JFrame;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class AppWindow extends JFrame {

    ImagePanel imagePanel;
    MenuPanel menuPanel;
    Controller controller;
    
    AppWindow() {
        this.imagePanel = new ImagePanel(800, 800);
        this.menuPanel = new MenuPanel(800, 30);
        this.controller = new Controller(menuPanel, imagePanel);
        this.menuPanel.button.addActionListener(controller);
        
        this.setTitle("App");
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.add(this.imagePanel, BorderLayout.CENTER);
        this.add(this.menuPanel, BorderLayout.NORTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
    }
}
