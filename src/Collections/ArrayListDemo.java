package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList <Integer> arrlst= new ArrayList<>();
        arrlst.add(5);
        arrlst.add(51);
        arrlst.add(54);
        arrlst.add(2);
        System.out.println(arrlst);

        System.out.println(arrlst.get(1));

        arrlst.set(1,12);
        System.out.println(arrlst);

        arrlst.remove(2);
        System.out.println(arrlst);

        Collections.sort(arrlst);
        System.out.println(arrlst);

        System.out.println(arrlst.size());
    }
}
