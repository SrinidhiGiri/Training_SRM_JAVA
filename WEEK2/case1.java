package Week2.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import javax.swing.*;

class Case{

    public static void main (String[] args) {
        try
        {
            FileReader fr = new FileReader("D:\\Copy File\\Example 3.1.txt");
            BufferedReader br = new BufferedReader(fr);
            PrintWriter out = (new PrintWriter(new FileWriter("D:\\Copy File\\Example 3.txt")));
            String s="";
            while((s = br.readLine()) != null)
            {
                out.write(s.toUpperCase()+"\n");
            }
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}