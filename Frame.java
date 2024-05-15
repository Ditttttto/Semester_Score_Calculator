import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Frame extends JFrame {
    Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setTitle("Semester Score Calculator"); 
        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(screenSize.width-this.getWidth())/2;
        int y=(screenSize.height-this.getHeight())/2;
        this.setLocation(x,y);
        setVisible(true);
    }
    
}
