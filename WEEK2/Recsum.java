package Day8.com;

import java.util.Scanner;
public class Recsum
{
    int sum = 0, j = 0;
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Treeset:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.print("Enter all the elements you want:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Recsum obj = new Recsum();
        int x = obj.add(a, a.length, 0);
        System.out.println("Sum:"+x);
    }
    int add(int a[], int n, int i)
    {
        if(i < n)
        {
            return a[i] + add(a, n, ++i);
        }
        else
        {
            return 0;
        }
    }
}