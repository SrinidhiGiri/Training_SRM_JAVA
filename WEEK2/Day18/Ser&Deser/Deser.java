package Day18.com;

import java.io.*;
public class Deser{

    public static void main(String [] args)
    {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("D:\\File\\example.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i)
        {
            i.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }

        System.out.println("Deserialized Employee:");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
    }
}