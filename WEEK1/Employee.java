package Training.com;

import java.util.*;
class Employee
{
    public int Age;
    int empid;
    long mobile;
    String name, address, mailid;
    Scanner get = new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Name of the Training.com.Employee");
        name = get.nextLine();
        System.out.println("Enter Mail id");
        mailid = get.nextLine();
        System.out.println("Enter Address of the Training.com.Employee:");
        address = get.nextLine();
        System.out.println("Enter employee id ");
        empid = get.nextInt();
        System.out.println("Enter Mobile Number");
        mobile = get.nextLong();
    }
    void display()
    {
        System.out.println("Training.com.Employee Name: "+name);
        System.out.println("Training.com.Employee id : "+empid);
        System.out.println("Mail id : "+mailid);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+mobile);
    }
}
class Programmer extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprogrammer()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateprog()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("********************************************");
        System.out.println("PAY SLIP FOR PROGRAMMER");
        System.out.println("********************************************");
        System.out.println("Basic Pay: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS PAY: Rs. "+gross);
        System.out.println("NET PAY: Rs. "+net);
    }
}
class Asstprofessor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getasst()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateasst()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSISTANT PROFESSOR");
        System.out.println("***********************************");
        System.out.println("Basic Pay: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS PAY: Rs. "+gross);
        System.out.println("NET PAY: Rs. "+net);
    }
}
class Associateprofessor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getassociate()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateassociate()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("***********************************");
        System.out.println("PAY SLIP FOR ASSOCIATE PROFESSOR");
        System.out.println("***********************************");
        System.out.println("Basic Pay: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS PAY: Rs. "+gross);
        System.out.println("NET PAY: Rs. "+net);
    }
}
class Professor extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    void getprofessor()
    {
        System.out.println("Enter basic pay");
        bp = get.nextDouble();
    }
    void calculateprofessor()
    {
        da=(0.97*bp);
        hra=(0.10*bp);
        pf=(0.12*bp);
        club=(0.1*bp);
        gross=(bp+da+hra);
        net=(gross-pf-club);
        System.out.println("************************");
        System.out.println("PAY SLIP FOR PROFESSOR");
        System.out.println("************************");
        System.out.println("Basic Pay: Rs. "+bp);
        System.out.println("DA: Rs. "+da);
        System.out.println("HRA: Rs. "+hra);
        System.out.println("PF: Rs. "+pf);
        System.out.println("CLUB: Rs. "+club);
        System.out.println("GROSS PAY: Rs. "+gross);
        System.out.println("NET PAY: Rs. "+net);
    }
}
class Salary
{
    public static void main(String args[])
    {
        int choice,cont;
        do
        {
            System.out.println("PAYROLL");
            System.out.println(" 1.PROGRAMMER \t 2.ASSISTANT PROFESSOR \t 3.ASSOCIATE PROFESSOR \t 4.PROFESSOR ");
            Scanner c = new Scanner(System.in);
            System.out.print("Enter Your Choice:");
            choice=c.nextInt();
            switch(choice)
            {
                case 1:
                {
                    Programmer p=new Programmer();
                    p.getdata();
                    p.getprogrammer();
                    p.display();
                    p.calculateprog();
                    break;
                }
                case 2:
                {
                    Asstprofessor asst=new Asstprofessor();
                    asst.getdata();
                    asst.getasst();
                    asst.display();
                    asst.calculateasst();
                    break;
                }
                case 3:
                {
                    Associateprofessor asso=new Associateprofessor();
                    asso.getdata();
                    asso.getassociate();
                    asso.display();
                    asso.calculateassociate();
                    break;
                }
                case 4:
                {
                    Professor prof=new Professor();
                    prof.getdata();
                    prof.getprofessor();
                    prof.display();
                    prof.calculateprofessor();
                    break;
                }
            }
            System.out.print("Please enter 0 to quit and 1 to continue: ");
            cont=c.nextInt();
        }while(cont==1);
    }
}