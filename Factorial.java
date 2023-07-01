class Factorial
{
    public static void main(String[]args)
    {
        int no=222;
        int fact=1;
        for(int i=1; i<=no; i++)
        {
            fact=fact*i;
        } 
        System.out.println("factorial"   +no+  "is"  +fact);
    }
}