import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class framecon extends JFrame{
    framecon(){
        this.setVisible(true);
        this.setTitle("hiu");
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//cant resize
        this.getContentPane().setBackground(Color.red);
    }
}