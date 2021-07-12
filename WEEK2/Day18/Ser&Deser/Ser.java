package Day18.com;
import java.io.*;
class Employee implements java.io.Serializable {
    public String name;
    public String address;
}
public class Ser {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Abinaya";
        e.address = "Madambakkam";
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("D:\\File\\example.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in example.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}

