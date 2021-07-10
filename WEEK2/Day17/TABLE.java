package Day17.com;

import javax.swing.*;
public class TABLE {
    JFrame f;
    TABLE(){
        f=new JFrame();
        String data[][]={ {"A1","Abi","9642600761"},
                {"A2","Sri","9845237600"},
                {"A1","Varshini","9737823099"}};
        String column[]={"ID","NAME","PHONE NUMBER"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TABLE();
    }
}