package Day17.com;

import javax.swing.*;
import java.awt.event.*;
public class ComboBox {
    JFrame f;

    ComboBox() {
        f = new JFrame("ComboBox Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JButton b = new JButton("Show");
        b.setBounds(200, 100, 75, 20);
        String languages[] = {"--SELECT--", "ECE", "EEE", "EIE", "CSE", "SWE"};
        final JComboBox cb = new JComboBox(languages);
        cb.setBounds(50, 100, 90, 20);
        f.add(cb);
        f.add(label);
        f.add(b);
        f.setLayout(null);
        f.setSize(350, 350);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Department Selected: "
                        + cb.getItemAt(cb.getSelectedIndex());
                label.setText(data);
            }
        });
            f = new JFrame();
        f = new JFrame("Tabbed Pane Example");
            JTextArea ta = new JTextArea(200, 200);
            JPanel p1 = new JPanel();
            p1.add(ta);
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();
            JTabbedPane tp = new JTabbedPane();
            tp.setBounds(50, 50, 200, 200);
            tp.add("main", p1);
            tp.add("visit", p2);
            tp.add("help", p3);
            f.add(tp);
            f.setSize(400, 400);
            f.setLayout(null);
            f.setVisible(true);
        }

    public static void main(String[] args) {
        new ComboBox();

    }
}