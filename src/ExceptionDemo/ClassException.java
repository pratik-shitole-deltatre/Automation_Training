package ExceptionDemo;

public class ClassException
{

    public static void excep(int num)
    {
        if (num>20)
        {
            throw new ArithmeticException("Age is above 20");

        }
    }

    public static void exceptiondemo() throws ArrayIndexOutOfBoundsException
    {
        int [] numbers = {1, 2, 3};
        System.out.println(numbers[5]);
    }

    public static void main(String[] args)
    {
        //excep(30);
        exceptiondemo();


       try
       {
           int [] numbers = {1, 2, 3};
           System.out.println(numbers[5]);
       }

//       catch (Exception e)
//       {
//           System.out.println(e.getMessage());
//       }
        finally {
           System.out.println("This is finally block");
       }

        System.out.println("This is after catch");
    }
}
