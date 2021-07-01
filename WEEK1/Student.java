import java.util.Scanner;

public class Student {

    String stud_name;
    int rollno,marks;
    Scanner sc = new Scanner(System.in);


    void getdata()
    {
        System.out.println("Enter Name of the Student:");
        stud_name = sc.nextLine();
        System.out.println("Enter roll no:");
        rollno = sc.nextInt();
        System.out.println("Enter Marks:");
        marks = sc.nextInt();

    }

    void display(){
        System.out.println(stud_name + "  has scored  " + marks + " marks" );
    }

    public static void main(String args[]){

        Student st = new Student();

        st.getdata();

        try {
            if (st.marks < 0 || st.marks > 100) {

                System.out.println("Enter valid marks" );
            }
            else
            {
                st.display();
            }

        }catch (Exception e)
        {
            System.out.println(e + "The marks you have entered are out of bounds");
        }
    }
}