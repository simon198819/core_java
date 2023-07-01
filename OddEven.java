import java.util.*;
class OddEven
{
    public static void main(String[]args)
    {
        int n,i;
        int sum=0;
        System.out.println("Enter The Range");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    if(n%2==0)
{
   for(int i=0; i<=n; i++)
          {
            sum=sum+i;
          }
System.out.println("Sum of Even Number"+sum);
}
else
{
for(int i=1; i<=n; i++)
      {
        sum=sum+i;
      }
      System.out.println("sum of Odd number"+sum);
}
}
}