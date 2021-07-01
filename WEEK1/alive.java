package Training.com;

class MyThreads extends Thread
{
    public void run()
    {
        System.out.println("r1 ");
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ie)
        {

        }
        System.out.println("r2 ");
    }
    public static void main(String[] args)
    {
        MyThreads t1= new MyThreads();
        MyThreads t2= new MyThreads();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}
