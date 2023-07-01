class A
{
    int a;String b;boolean c;
    A()
    {
        a=1020; b="Ram";c=false;
    }
    void show()
    {
        System.out.println(a+" "+b+" "+c);
    }
}
class Demo128
{
    public static void main(String[]args)
    {
        A ref=new A();
        ref.show();
    }
}