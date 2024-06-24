import java.util.Arrays;

public class MaxNum
{
    int max = 0;
public void Max()
{
    int [] Maxarr =  new int[5];
    Maxarr[0]=12;
    Maxarr[1]=45;
    Maxarr[2]=34;
    Maxarr[3]=1;
    Maxarr[4]=56;

    max=Maxarr[0];
    
    for(int i =1; i<Maxarr.length;i++)
    {

        if (Maxarr[i]>max)
        {
            max = Maxarr[i];
//                Maxarr[i]=Maxarr[i+1];
//                Maxarr[i+1]=temp;
        }
    }
    System.out.println(max);
    System.out.println(Maxarr[0]);
    System.out.println(Arrays.toString(Maxarr));
}

    public static void main(String[] args)
    {
     MaxNum maximum=new MaxNum();
     maximum.Max();
    }
}
