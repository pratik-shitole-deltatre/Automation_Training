package AccesModifier1;

public class checkacces
{
    public static void main(String[] args) {
        ArithmeticOps ops=new ArithmeticOps();
        System.out.println(ops.i);//default type variable can be accessed within same package
        System.out.println(ops.k);//public type variable can be accessed within same package
        System.out.println(ops.l);//protected type variable can be accessed within same package
    }
}
