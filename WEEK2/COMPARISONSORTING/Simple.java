package Comparison.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple{
    public static void main(String[] args){

        ArrayList al=new ArrayList();
        al.add(new Student(10,"A",23));
        al.add(new Student(11,"B",22));
        al.add(new Student(12,"C",21));

        System.out.println("SORTING BY NAME");
        Collections.sort(al,new NameComparator());
        for (Object o : al) {
            Student st = (Student) o;
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("------------------------");
        System.out.println("SORTING BY AGE");

        Collections.sort(al,new AgeComparator());
        for (Object o : al) {
            Student st = (Student) o;
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }


    }
}