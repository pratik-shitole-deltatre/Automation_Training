package Interface_And_Abstraction;
public class AbstractionJava extends AbstractDemo //implements InterfaceDemo
{

//    @Override
//    public void interdemo()
//    {
//        System.out.println("This is interface method");
//    }

   public void absmethoddemo()
   {
       System.out.println("This is abs method");
   }
    public void absmethoddemo(int num)
    {
        System.out.println("This is abs method");
    }
    public void absmethod2()
    {
        System.out.println("this is child");
        super.absmethod2();
    }

    public static void main(String[] args)
    {
        AbstractionJava absjava = new AbstractionJava();
        absjava.absmethod2();
        //super.absmethod2();
    }
}
