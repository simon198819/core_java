import java.util.*;
class Power
{
    public static void main(String[]args)
    {
        int n,p,temp=1;
        System.out.println("Enter the no");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter The Power");
        p=sc.nextInt();
        for(int i=1; i<=p; i++)
        {
            temp=n*temp;;
        }
        System.out.println("Power"+temp);
    }
}