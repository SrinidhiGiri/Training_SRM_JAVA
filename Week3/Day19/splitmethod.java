package Day19.com;

public class splitmethod{
    public static void main(String args[]){
        String s1="Example demonstrating split method";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }}
