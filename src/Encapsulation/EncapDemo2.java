package Encapsulation;

public class EncapDemo2
{
    public static void encapmthd()
    {
        EncapDemo encp=new EncapDemo();
        System.out.println(encp.getNum());
        encp.setNum(45);
        System.out.println(encp.getNum());
    }

    public static void main(String[] args) {
        encapmthd();
        EncapDemo ecap =new EncapDemo();
        System.out.println(ecap.getNum());
    }
}
