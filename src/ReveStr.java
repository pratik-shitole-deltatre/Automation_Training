import java.sql.Array;
import java.util.ArrayList;

public class ReveStr
{

    public void revstr()
    {
        String str = "This string";
        String revedstr="";

//        for (int i=0;i<+str.length();i++)
//        {
//            Array [] arr =new Array[str.charAt(i)];
////            arr=str.charAt(i);
//            System.out.println(arr);
//            System.out.println(str.charAt(i));
//        }


        String str2=new String();
        for(int j =str.length()-1;j>=0;j--)
        {
            //System.out.print(str.charAt(j));
            char ch = str.charAt(j);
            revedstr = revedstr+ch;
        }

        System.out.println(revedstr);
        System.out.println(str2);
    }

    public static void main(String[] args)
    {
    ReveStr rev = new ReveStr();
    rev.revstr();
    }
}
