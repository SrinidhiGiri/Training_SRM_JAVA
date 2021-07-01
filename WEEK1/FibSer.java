package Training.com;

public class FibSer extends Thread
{
    private final int x;
    public int answer;

    public FibSer(int x) {
        this.x = x;
    }

    public void run() {
        if( x <= 2 )
            answer = 1;
        else {
            try {
                FibSer f1 = new FibSer(x-1);
                FibSer f2 = new FibSer(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }
            catch(InterruptedException ignored) { }
        }
    }


    public static void main(String[] args)throws Exception
    {
        try {
            FibSer f = new FibSer(5);
            f.start();
            f.join();
            System.out.println(f.answer);
        }
        catch(Exception e) {
            System.out.println("usage: java Fib NUMBER");
        } {


    }

    }
}
