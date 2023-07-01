import java.util.*;
public class LinkedListDemo
{
public static void main(String[]args)
{
    LinkedList ll=new LinkedList();
    ll.add("Simon");
    ll.add("Ram");
    ll.add(35);
    ll.add(56);
    ll.add("Simon");
    ll.add(null);
    ll.add(null);

    System.out.println(ll);
}
}