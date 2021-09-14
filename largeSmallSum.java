/*You are required to implement the following Function 

def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest largest element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7

Explanation

Second largest among even position elements(1 3 5) is 3
Second largest among odd position element is 4
Thus output is 3+4 = 7
*/

import java.util.*;
public class Main
{
    public static int largeSmallSum(int[]arr) 
    {
        ArrayList < Integer > even = new ArrayList < Integer > ();
        ArrayList < Integer > odd = new ArrayList < Integer > ();
        even.add (arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            if (i % 2 == 0)
                even.add (arr[i]);
            else
                odd.add (arr[i]);
        }
        Collections.sort (even);
        Collections.sort (odd);

        return even.get (even.size () - 2) + odd.get (1);
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = input.nextInt();
		    }
		    
		  System.out.println(largeSmallSum(arr));
		
	}
}
