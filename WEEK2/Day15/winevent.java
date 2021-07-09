package Day15.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class AnonymousInnerClasses extends JFrame
{
    AnonymousInnerClasses()
    {
        addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }) ;
    }
}
public class winevent
{

    public static void main(String[] args)
    {
        AnonymousInnerClasses frame = new AnonymousInnerClasses();
        frame.setTitle("Windows Events with Anonymous Inner class");
        frame.setSize(300, 300);
        frame.setBackground(Color.black);

        Label lb1;

        lb1 = new Label("Window Closing Method");

        lb1.setBounds(5, 50, 150, 30);

        lb1.setBackground(Color.pink);

        frame.add(lb1);
        frame.setVisible(true);
    }

}