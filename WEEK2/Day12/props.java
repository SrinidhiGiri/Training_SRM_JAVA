package Day12.com;

import java.util.*;
import java.io.*;

public class props {
    public static void main(String[] args) throws Exception
    {
        Properties p = new Properties();

        p.setProperty("name", "Srinidhi Giri");
        p.setProperty("email",
                "srinidhi.g@gmail.com");
        p.store(new FileWriter("info.properties"),
                "Email Id");
    }
}