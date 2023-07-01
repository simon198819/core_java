import java.util.*;
public class ListItrDemo
{
    public static void main(String[]args)
    {
        List l=new ArrayList();
        l.add(10);
        l.add("Simon");
        l.add(20);
        l.add(30);

        ListIterator li=new ListIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
    }
}