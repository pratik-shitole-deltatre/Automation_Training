package Java_sessions;

public class Variables_day3
{
 int num=5; //Global variable

 public void method1()
 {
     int num2=10;//Local Variable
 }
 public void method2()
 {
     {
         int num3=15;//scope of variable is within corresponding curly brackets
     }
     System.out.println(num);
     //System.out.println(num2);
    // System.out.println(num3);
 }
}
