package Day19.com;

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

// put this class in different Dog.java file
public class Reflection extends Animal {
    public void display() {
        System.out.println("I am a dog.");
    }
}

// put this in Main.java file
class Main {
    public static void main(String[] args) {
        try {

            Reflection d1 = new Reflection();
            Class obj = d1.getClass();
            String name = obj.getName();
            System.out.println("Name: " + name);
            int modifier = obj.getModifiers();
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}