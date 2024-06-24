package JavaLoops;

public class Patternprint
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
    }

    public static void main(String[] args)
    {
     Patternprint ptrn =new Patternprint();
     ptrn.pattern();
    }
}
