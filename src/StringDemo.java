import java.util.Arrays;

public class StringDemo
{
    public static void main(String[] args)
    {
        String str ="Sam is my name";
        System.out.println(str.charAt(1));
        char [] arrstr=str.toCharArray();
        System.out.println(arrstr);

        String [] splitedstr=str.split(" ");
        System.out.println(Arrays.toString(splitedstr));

        System.out.println(String.join("_",splitedstr));
    }
}
