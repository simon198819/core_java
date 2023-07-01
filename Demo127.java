class A
{
    A()
    {
        a=0; name="null"; 
    }
    void show()
    {
        System.out.println(a+" "+name);
    }
}
class Demo127
{
    public static void main(String[]args)
    {
        A sef=new A();
        sef.show();
    }
}