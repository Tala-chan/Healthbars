import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{
    public Window(){
        this.setTitle("Healthbars");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(2,1);
        multiPanel.setBorder(BorderFactory.createLineBorder(Color.white, 10));
        multiPanel.setLayout(layout);

        multiPanel.add(new Detector());
        multiPanel.add(new Detector());

        this.getContentPane().add(multiPanel);

        this.pack();
        this.setVisible(true);
    }
}
