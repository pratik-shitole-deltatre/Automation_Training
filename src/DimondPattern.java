public class DimondPattern
{
    public void pattern()
    {
        for(int j=0;j<=5;j++)
        {
            //System.out.println(" ");
            for (int i = 0; i <= j; i++)
            {
                System.out.print("* ");

            }
            System.out.println(" ");
        }

        for (int k=5;k>=0;k--)
        {
            for (int l=k;l>=0;l--)
            {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }

    public void centeredtri()
    {
        for(int j=0;j<=5;j++)
        {
            //System.out.print(" ");

            for(int m=5;m>=j;m--)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <= (2*j)-1; i++)
            {
                System.out.print("*");

            }
            System.out.println(" ");
        }
        for(int a = 4;a>0;a--)
        {
            for(int b=5;b>=a;b--)
            {
                System.out.print(" ");
            }
            for(int c=1;c<=(2*a)-1;c++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args)
    {
        DimondPattern ptrn =new DimondPattern();
        //ptrn.pattern();
        ptrn.centeredtri();
    }
}
