class Encapsulation
{
    private int value;
    public void setValue(int x)
    {
        value=x;
    }
    public int getValue()
    {
        return value;
    }
}
class EncapsulationDemo
{
    public static void main(String[]args)
    {
        Encapsulation e=new Encapsulation();
        e.setValue(100);
        System.out.print(e.getValue());
    }
}