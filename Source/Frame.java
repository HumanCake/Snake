import javax.swing.*;
import java.awt.*;

public class Frame {
    JFrame frame = new JFrame("Snake Game");

    Frame(int width, int height){
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //   frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
