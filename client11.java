import java.util.*;
interface client11
{
    void input();   //public + abstract
    void output();   //public +abstract
}
class Simon implements client
{
    String name;double sal;int age;
    void input()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your name:");
        name=s.nextLine();

        System.out.println("Enter your Salary:");
        sal=s.nextDouble();

        System.out.println("Enter your Age:");
        int age=s.nextInt();
    }
    void output()
    {
        System.out.println(name+" "+sal);
    }
    public static void main(String[]args)
    {
        client11 c=new Simon();
        c.input();
        c.output();
    }
}