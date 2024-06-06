package Java_sessions;

public class TypeCasting {
    //Upcasting Widening casting
    short short_var = 32;
    int mult_result = short_var;

    //Downcasting Narrowing casting
    int num = 4;
    short new_num = (short) num;

    //int to string
    static int i = 10;
    String s = String.valueOf(i);

    //String to Int
    static int j = Integer.parseInt("200");

    public static void main(String[] args)
    {
        System.out.println("Printing value of i : " + i);
        System.out.println("Printing value of j : " + j);

    }
}