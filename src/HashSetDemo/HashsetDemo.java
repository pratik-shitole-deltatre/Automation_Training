package HashSetDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo
{
    HashSet<Integer> hashdemo = new HashSet<>();

    public void setops()
    {
        hashdemo.add(2);
        hashdemo.add(2);
        hashdemo.add(12);
        hashdemo.add(32);

        hashdemo.remove(32);

        System.out.println(hashdemo);
    }

    public void hshmethod()
    {

        Object [] arr=hashdemo.toArray();


        System.out.println(Arrays.toString(arr));
        Iterator<Integer> it = hashdemo.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }

    public static void main(String[] args)
    {
        HashsetDemo hsh =new HashsetDemo();
        hsh.setops();
        hsh.hshmethod();
    }
}
