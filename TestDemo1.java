class MyThread extends Thread{
}
class TestDemo1
{
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        MyThread mt=new MyThread();
        
        System.out.println(mt.getPriority());
    }
}