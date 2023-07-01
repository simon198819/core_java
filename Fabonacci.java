class Fabonacci
{
    static int n1=0,n2=1,n3=0;
    static void PrintFabonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(","+n3);
            printFabonacci(count-1);
        }
    }
    public static void main(String[]args)
    {
        int count=10;
        System.out.println(n1+",",+n2);
        printFabonnaci(count-2);
    }
}