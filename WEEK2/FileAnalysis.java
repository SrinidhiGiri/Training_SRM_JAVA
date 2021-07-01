package Week2.com;

import java.io.File;
public class FileAnalysis {
    public static void main(String[] args) {
        File myFile = new File("D:\\Copy File\\Example1.txt");
        if (myFile.exists()) {
            System.out.println(myFile.getName() + " exists");
            System.out.println("The file is " + myFile.length() + " bytes long");
            if (myFile.canRead())
                System.out.println(" Readable");
            else
                System.out.println(" Non Readable");
            if (myFile.canWrite())
                System.out.println(" Writeable");
            else
                System.out.println(" Non Writeable");
            System.out.println("path: " +myFile.getAbsolutePath());
            System.out.println("File Name: "+ myFile.getName());
            System.out.println("File Size: "+ myFile.length() + " bytes");
        } else
            System.out.println("File does not exist");
    }
}