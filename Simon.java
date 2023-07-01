import java.util.*;
interface client
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
        name=r.nextLine();

        System.out.println("Enter your Salary:");
        sal=r.nextDouble();

        System.out.println("Enter your Age:");
        int age=r.nextInt();
    }
    void output()
    {
        System.out.println(name+" "+sal);
    }
    public static void main(String[]args)
    {
        client c=new Simon();
        c.input();
        c.output();
    }
}