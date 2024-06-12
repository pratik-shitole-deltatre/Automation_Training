package AccessModifier2;

import AccesModifier1.ArithmeticOps;

public class Checkaccess2
{
    public static void main(String[] args) {
        ArithmeticOps ops2=new ArithmeticOps();
        System.out.println(ops2.k);//public type variable can be accessed outside package
    }
}
