package AccessModifier2;

import AccesModifier1.ArithmeticOps;

public class Checkaccess3 extends ArithmeticOps
{
    public static void main(String[] args) {
        Checkaccess3 ops3=new Checkaccess3();
        ops3.accesscheck();
    }
    public void accesscheck()
    {
        System.out.println(super.l);
    }
}
