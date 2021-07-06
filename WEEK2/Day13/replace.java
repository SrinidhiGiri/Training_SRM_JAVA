package Day13.com;
//qno:4 java program to replace set of characters in the given string.
class replace {
    public static void main(String args[])
    {
        String str = "Hello Forld";
        int index = 6;
        char ch = 'W';
        System.out.println("Original String = " + str);
        str = str.substring(0, index) + ch
                + str.substring(index + 1);

        System.out.println("Modified String = " + str);
    }
}
