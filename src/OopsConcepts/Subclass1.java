package OopsConcepts;

public class Subclass1 extends InheritanceDemo
{

    int num1=50;
    int num2=60;
    public void methd3()
    {
        System.out.println("This is method 3");
    }

    public void methd4()
    {
        System.out.println("This is method 4");
    }



    public static void main(String[] args)
    {
        Subclass1 sub=new Subclass1();
        InheritanceDemo inherdemo=new InheritanceDemo();
        InheritanceDemo dmo =new Subclass1();
        sub.methd1();
        sub.methd1();
        sub.methd3();
        sub.methd4();
        System.out.println(inherdemo.num1);
        System.out.println(inherdemo.num2);

        System.out.println(sub.num1);
        System.out.println(sub.num2);
//        String newstr = new String("RAM");
//        String newstr1 = new String("RAM");
//
//        System.out.println(newstr==newstr1);

    }
}
