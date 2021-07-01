package Training.com;

class ThisRetrun
{
    private int i = 0;

    ThisRetrun increment()
    {
        i++;
        return this ;
    }
    void print()
    {
        System.out.println ("The i value is" + i);
    }
    public static <ThisReturn> void main (String arg[])
    {
        ThisReturn tr = (ThisReturn) new ThisRetrun();
        ((ThisRetrun) tr).increment().increment().increment().increment().print();
    }
}
