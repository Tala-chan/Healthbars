import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Detector extends JPanel implements MouseListener {
    final int SIZE = 500;
    int hp = 300;
    Color myGreen = new Color(89, 161, 71); //
    public Detector(){
        this.setPreferredSize(new Dimension(SIZE,SIZE));
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        hp=hp-50;
        repaint();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(99,99,301,51);
        g.setColor(myGreen);
        g.fillRect(100,100,hp,50);
    }

    @Override
    public void mousePressed(MouseEvent e) {

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
}
