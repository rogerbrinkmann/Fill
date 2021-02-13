import javax.swing.JFrame;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class AppWindow extends JFrame {

    AppWindow() {
        this.setTitle("App");
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel imagePanel = new ImagePanel();
        MenuPanel menuPanel = new MenuPanel();

        Controller controller = new Controller(menuPanel, imagePanel);

        menuPanel.radioFill.addActionListener(controller);
        menuPanel.radioDraw.addActionListener(controller);
        imagePanel.addMouseListener(controller);
        imagePanel.addMouseMotionListener(controller);

        this.add(imagePanel, BorderLayout.CENTER);
        this.add(menuPanel, BorderLayout.NORTH);

        this.setResizable(false);
        this.pack();
    }
}
