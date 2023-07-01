import java.util.*;
class TestDemo111
{
    public static void main(String[]args)
    {
     Vector v=new Vector();
     v.add(10);
     v.add(23);
     v.add(344);
     v.add("Simon");
     Enumeration e=v.elements();
     while(e.hasMoreElements())
     {
        System.out.println(e.NextElements());
     }
    }
}