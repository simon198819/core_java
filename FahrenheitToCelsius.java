import java.util.*;
class FahrenheitToCelsius
{
    public static void main(String[]args)
    {
        float temperature;
        Scanner in=new Scanner(System.in);
        System.out.println("enter Fahrenheit:");
        temperature=in.nextInt();
        temperature=((temperature-32)*5);
        System.out.println("Temperature in Celsius="+temperature);
    }
}