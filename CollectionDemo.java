import java.util.*;
public class CollectionDemo
{
    public static void main(String[]args)
    {
        Vector v=new Vector();
        v.add("Simon");
        v.add("Ram");
        v.add(333);
        v.add(333.99);
        System.out.println(v.lastElement());
    }
}