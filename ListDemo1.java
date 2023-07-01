import java.util.ArrayList;
import java.util.List;
public class ListDemo1
{
    public static void main(String[]args)
    {
        List l=new ArrayList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(null);
        l.add(null);
        l.add(90);
        System.out.println(l);
    }
}