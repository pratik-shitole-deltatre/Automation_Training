package HashMapdemo;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmapdemo {

    public char maxchar(String str)
    {
        HashMap<Character,Integer> maxitem =new HashMap<>();
        int maxfreq=0;
        char result='0';
        for(int j =0 ;j<str.length();j++)
        {
            char ch =str.charAt(j);
            maxitem.put(ch,maxitem.getOrDefault(ch,0)+1);
            if (maxitem.get(ch)>maxfreq)
            {
                result=ch;
                maxfreq=maxitem.get(ch);
            }

        }
        System.out.println(maxfreq);
        return result;
//        String str = "Praaatikk";
//        ArrayList <Character> maxedch = new ArrayList<>();
//        for(int i=0;i<str.length()-1;i++)
//        {
//            if (str.charAt(i)==str.charAt(i+1))
//            {
//                char [] maxch ;
//
//                maxedch.add(str.charAt(i));
//                maxedch.add(str.charAt(i+1));
//            }
//
//        }
//        System.out.println(maxedch);
    }


    public static void main(String[] args)
    {
//        HashMap<Integer,String> hshmp=new HashMap<>();
//        hshmp.put(1,"SAM");
//        hshmp.put(2,"Allen");
//        hshmp.put(3,"John");
//
//        hshmp.remove(3);
//        System.out.println(hshmp);
//        System.out.println(hshmp.get(3));

        Hashmapdemo hshdemo=new Hashmapdemo();
        System.out.println(hshdemo.maxchar("Praaatikkkkk"));
    }
}
