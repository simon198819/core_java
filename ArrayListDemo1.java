import java.util.*;
public class ArrayListDemo1
{
    public static void main(String[]args)
    {
        ArrayList al=new ArrayList();
        al.add("Simon");
        al.add("Mohan");
        al.add(56);
        al.add(null);
        al.add(null);
        al.add("Simon");
        System.out.println(al);
    }
}