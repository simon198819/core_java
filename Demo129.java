class Demo129
{
    void show()
{
    int a=10, b=20, c;
    c=(a+b);
    System.out.println(c);
}
void show(int x,int y)
{
    int c;
    c=x+y;
    System.out.println(c);
}
void show(int x,double y)
{
double c;
c=x+y;
System.out.println(c);
}
    public static void main(String[]args)
    {
        A r=new A();
        r.show();
        r.show(20,30);
        r.show(40,30.5);
    }
}
