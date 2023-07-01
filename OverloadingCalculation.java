class OverloadingCalculation
{
    void sum(int a,long b)
    {
        System.out.println(a+b);
    }
        void sum(int a,int b,int c)
        {
            System.out.println(a+b+c);
        }
        public static void main(String[]args)
        {
            OverloadingCalculation oc=new OverloadingCalculation();
            oc.sum(20,30);
            oc.sum(90,77,77);
        }
        }
    
