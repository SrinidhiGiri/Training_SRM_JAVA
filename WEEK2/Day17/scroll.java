package Day17.com;

import javax.swing.*;
import java.awt.*;

public class scroll
{
    public static void main(String... ar)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new A();
            }
        });

    }
}
class A
{
    JFrame jf;
    JPanel jp;
    JLabel label1;

    A()
    {
        jf = new JFrame("JScrollPane");
        label1 = new JLabel("Displaying a picture ",JLabel.CENTER);
        ImageIcon image = new ImageIcon("C:\\Users\\Abinaya Giri\\OneDrive\\Pictures\\Screenshots\\2021-03-09 (5).png");
        JLabel label = new JLabel(image, JLabel.CENTER);
        jp = new JPanel(new BorderLayout());
        jp.add( label, BorderLayout.CENTER );
        JScrollPane scrollP = new JScrollPane(jp);
        jf.add(label1,BorderLayout.NORTH);
        jf.add(scrollP,BorderLayout.CENTER);
        jf.setSize(350,270);
        jf.setVisible(true);
    }

}