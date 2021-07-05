package Day12.com;

import java.util.ArrayList;
import java.util.Iterator;

public class length {



    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Abinaya");
        list.add("Srinidhi");
        list.add("Archana");
        list.add("Vishal");



        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().length()%2==0) {
                it.remove();
            }
        }
        System.out.println(list);

    }
}