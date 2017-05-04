/**
 * @Author John Antonio Collins
 * Created on 5/3/17.
 * this is the Solution class that I copy/pasted into hackerrank.com
 */
import java.util.*;

public class Solution_only_main
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //MY CODE START
        int[] myArray;

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        myArray = new int[length];
        for (int i = 0; i < length; i++)
        {
            myArray[i] = scan.nextInt();
        }

        int counterOfNegativeSubArrays = 0;
        for (int k = 0; k < myArray.length; k++)
        {
            int subSum = 0;
            for (int i = k; i < myArray.length; i++)
            {
                subSum += myArray[i];
                if (subSum < 0)
                {
                    counterOfNegativeSubArrays++;
                }
            }
        }
        System.out.println(counterOfNegativeSubArrays);
        //MY CODE END
    }
}
