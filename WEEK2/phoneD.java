package Day10.com;

import java.util.Map;
import java.util.TreeMap;
class PhoneDirectoryWithTreeMap {

    private TreeMap<String,String> data;
    public PhoneDirectoryWithTreeMap() {
        data = new TreeMap<String,String>();
    }
    public String getNumber( String name ) {
        return data.get(name);
    }
    public void putNumber( String name, String number ) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        data.put(name,number);
    }
    public void print() {
        for ( Map.Entry<String,String> entry : data.entrySet() )
            System.out.println( entry.getKey() + ":  " + entry.getValue() );
    }

}
public class phoneD {

    public static void main(String[] args) {
        PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
        directory.putNumber("Vish",  "985638908");
        directory.putNumber("Abi",   "992346786");
        directory.putNumber("Vaish", "986212340");
        System.out.println("CONTACTS ARE");
        directory.print();
        System.out.println("--------------------------------");
        System.out.println("REQUESTED CONTACTS");
        System.out.println("Number for Abi is " + directory.getNumber("Abi"));
        System.out.println("Number for Sri is " + directory.getNumber("Sri"));
    }

}
