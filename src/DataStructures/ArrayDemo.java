package DataStructures;

import java.util.Arrays;

public class ArrayDemo
{
    // Initialize an integer array with specific values
    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers2 = new int[5];//initializing array
    int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

    public static void main(String[] args) {
        ArrayDemo demo= new ArrayDemo();
        //System.out.println(Arrays.toString(demo.numbers));
        //System.out.println(Arrays.toString(demo.numbers2));
        demo.addArrElement();
        demo.sortarr();

    }

    public void addArrElement()
    {
       /* for(int i=0;i<numbers2.length;i++)
        {
            numbers2[i]=i;
        }*/
        numbers2[0]=23;//adding element into array
        numbers2[1]=12;
        numbers2[2]=54;
        numbers2[3]=34;
        numbers2[4]=1;
        //System.out.println(Arrays.toString(numbers2));
        //System.out.println(numbers2[3]);//accessing array element through index
    }

    public void sortarr()
    {
        for(int j=0;j<numbers2.length-1;j++)
        {
            for(int k=j+1;k<numbers2.length;k++)
            {
                    int temp = 0;
                    if (numbers2[j] > numbers2[k])
                    {
                        temp = numbers2[j];
                        numbers2[j] = numbers2[k];
                        numbers2[k]=temp;
                    }
                }
            }
        System.out.println(Arrays.toString(numbers2));
        }

    }

