import java.util.*;
interface profesor
{
    void input();   
    void output();  
}
class Simonn implements profesor
{
    String name; double sal; int age;
    public void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Your name:");
        name=r.nextLine();

        System.out.println("Enter your Salary:");
        sal=r.nextDouble();

        System.out.println("Enter your Age:");
        age=r.nextInt();
    }
    public void output()
    {
        System.out.println(name+" "+sal+" "+age);
    }
    public static void main(String[] args)
    {
        profesor p=new Simonn();
        p.input();
        p.output();
    }
}