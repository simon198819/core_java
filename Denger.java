class Denger
{
void show(int a)
{
    System.out.println("2");
}
}
class Rambo extends Denger
{
    void show(int a)
    {
        System.out.println("555");
    }
    public static void main(String[]args)
    {
        Denger d=new Denger();
        d.show(3);

        Rambo r=new Rambo();
        r.show(7);
    }
}