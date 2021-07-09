package Day14.com;
import javax.swing.*;
import java.awt.*;

public class FrameExample
{
    JFrame frame;

    FrameExample()
    {
        frame=new JFrame("Simple Frame");

        JButton button = new JButton("Click Me");

        button.setBounds(200, 150, 90, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button);

        frame.setSize(500, 600);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
        new FrameExample();
    }
}
