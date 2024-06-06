package Object_Typecasting;

public class Main
{
    public static void main(String[] args)
    {
        //upcasting
        Animal animal1 = new Dog();
        animal1.sound();
        //animal1.wagTail();//animal dont have this method


        //Downcasting
        Animal animal2 = new Cat();
        animal2.sound();
        Cat cat = (Cat) animal2;
        cat.purr();
    }
}
