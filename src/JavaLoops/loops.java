package JavaLoops;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class loops
{
    String nrml= "Pratik";
    String rves="";
    String revarr ="" ;

    public static void main(String[] args)
    {
        loops rev=new loops();
        //rev.reverse();
        //rev.whileloop();
        //rev.dowhileloop();
        //rev.enhancefor();
       // rev.foreach();
        //rev.breakcontinue();
        rev.itratorexample();



    }


    public void reverse()
{
    outer:for(int i=nrml.length()-1;i>=0;i--)
    {
            char ch=nrml.charAt(i);
            revarr=revarr + ch;
    }
    System.out.println(revarr);
}

 public void whileloop() {

     int count = 1;

     // Using a while loop to print numbers from 1 to 5
     while (count <= 5) {
         System.out.println("Count is: " + count++);
         //count++; // Incrementing count in each iteration

     }
 }
     public void dowhileloop()
     {
         int count2 = 10;

         // Using a do-while loop to print numbers from 1 to 5
         do {
             System.out.println("Count is: " + count2);
             count2++; // Incrementing count in each iteration
         } while (count2 <= 5);
     }

    public void enhancefor() {
        int[] numbers = {1, 2, 3, 4, 5};

// Using enhanced for loop to iterate over the array
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }

    public void foreach()
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using forEach loop to iterate over the list
        names.forEach(name -> System.out.println("Name: " + name));
    }

    public void breakcontinue()
    {
        for (int i = 0; i < 10; i++)
        {
            if (i == 5)
            {
                break; // Exit the loop when i equals 5

            }
            if (i == 3)
            {
                continue;// Skip even numbers
            }
            System.out.println(i);
        }
    }

    public void itratorexample()
    {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }


}


