class Test
{
    int a=10; String b="Gita";
    void show()
    {
        System.out.println(a+" "+b);
    }
}
class Demo126
{
    public static void main(String[]args)
    {
        Test t;
        t=new Test();
        t.show();
    }
}