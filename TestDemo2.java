class MyThread extends Thread{
}
class TestDemo2
{
    public static void main(String[]args)
    {
        System.out.println(Thread.currentThread().getPriority());
        MyThread mt=new MyThread();

        System.out.println(mt.getPriority());
    }
}