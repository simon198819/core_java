class LargestNumber
{
    public static void main(String[]args)
    {
        int x,y,z;
        System.out.println("Enter Three numbers");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y && x>z)
        System.out.println("First no is largest");
           else if(y>x &&y>z)

           System.out.println("2nd no is largest");
            else if(z>x && z>y)

            System.out.println("3rd number is llargest");
              else
              System.out.println("Entered no are not distinct");
    }
}