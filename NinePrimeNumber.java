import java.util.*;
class NinePrimeNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1, count = 0, i;
       {
        num=num+1;
        for(i=2; i<=num;i++)
        {
            if (num%i==0)
            break;
            }
            if(i==num)
            count=count+1;
        }
        System.out.println("The" +n+"9th prime number is:"+num);
       }
    }
