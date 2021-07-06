package Day13.com;
//qno:5 java program to demonstrate the use of Object and Class classes.
class Mobile{
    String brand, color;
    public Mobile(String brand, String color)
    {
        this.brand = brand;
        this.color = color;

    }
    public static void main(String args[]){
        Mobile Abinaya = new Mobile("iPhone","Gold");
        Mobile Srinidhi = new Mobile("Samsung","White");
        Mobile Varshini = new Mobile("Nexus","Black");
        System.out.println("Abinaya own " + Abinaya.brand +" "+ Abinaya.color + " color smartphone");
        System.out.println("Srinidhi own " + Srinidhi.brand +" "+ Srinidhi.color + " color smartphone");
        System.out.println("Varshini own " + Varshini.brand +" "+ Varshini.color + " color smartphone");

    }
}