package ClassesAndObjects;

public class ObjectsDemo
{
    int i =25;
    static int j=15;
    String name="Sam";

    ObjectsDemo(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    ObjectsDemo()
    {
        System.out.println(this.name);
    }


    public static void main(String[] args)
    {
        ObjectsDemo obj=new ObjectsDemo();
    int a=obj.objmethod("Pratik");
    }

    public int objmethod(String str)
{
    return str.length();
}
}
