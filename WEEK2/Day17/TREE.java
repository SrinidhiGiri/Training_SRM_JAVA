package Day17.com;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TREE {
    JFrame f;
    TREE(){
        f=new JFrame();
        DefaultMutableTreeNode group=new DefaultMutableTreeNode("BTS");
        DefaultMutableTreeNode members=new DefaultMutableTreeNode("MEMBERS");
        DefaultMutableTreeNode songs=new DefaultMutableTreeNode("SONGS");
        group.add(members);
        group.add(songs);
        DefaultMutableTreeNode one=new DefaultMutableTreeNode("JIN");
        DefaultMutableTreeNode two=new DefaultMutableTreeNode("RM");
        DefaultMutableTreeNode three=new DefaultMutableTreeNode("SUGA");
        DefaultMutableTreeNode four=new DefaultMutableTreeNode("JHOPE");
        DefaultMutableTreeNode five=new DefaultMutableTreeNode("V");
        DefaultMutableTreeNode six=new DefaultMutableTreeNode("JIMIN");
        DefaultMutableTreeNode seven=new DefaultMutableTreeNode("JK");
        members.add(one); members.add(two); members.add(three);
        members.add(four);members.add(five);members.add(six);members.add(seven);
        DefaultMutableTreeNode first=new DefaultMutableTreeNode("FIRE");
        DefaultMutableTreeNode second=new DefaultMutableTreeNode("DOPE");
        DefaultMutableTreeNode third=new DefaultMutableTreeNode("SAVE ME");
        DefaultMutableTreeNode fourth=new DefaultMutableTreeNode("IDOL");
        songs.add(first);songs.add(second);songs.add(third);songs.add(fourth);
        JTree jt=new JTree(group);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TREE();
    }}