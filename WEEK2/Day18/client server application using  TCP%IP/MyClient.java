package Day18.com;
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",1808);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Bonjour");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}