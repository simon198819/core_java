import java.util.*;
public class CollectionDemo4
{
    public static void main(String[]args)
    {
        Stack s=new Stack();
        s.push("Simon");
        s.push("Ram");
        s.push(100);
        s.push(33.99);
        s.push("abs");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
    }
}