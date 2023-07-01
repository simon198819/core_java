class TotalEarnings extends Thread
{
    int total=0;
    public void run()
    {
        synchronized(this)
        {
            for(int i=1; i<10;i++)
            {
                total=total+100;
            }
            this.notify();
        }
    }
}
 public class MovieApps
{
    public static void main(String[]args)throws InterruptedException
    {
        TotalEarnings te=new TotalEarnings();
        te.start();

        synchronized(te)
        {
            te.wait();
            System.out.println("TotalEarnings: "+te.total+" RS");
        }
    }
}