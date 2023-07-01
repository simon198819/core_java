import java.util.*;
class UserInput
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=s.next();
        System.out.println("Enter your Age:");
        int age=s.nextInt();
        System.out.println("Enter your Gender:");
        char gender=s.next().charAt(0);
        System.out.println("Enter your Phone number:");
        long phno=s.nextLong();
    }
}