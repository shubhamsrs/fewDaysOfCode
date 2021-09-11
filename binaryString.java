/*The Binary number system only uses two digits, 0 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:
No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1

Input:
str: 1C0C1C1A0B1

Output:
1

*/
import java.util.*;
public class Main
{
	public static int binaryString(String str){
    int ip1 = str.charAt (0) - '0';
        for (int i = 1; i < str.length ();)
        {
            char ip2 = str.charAt (i);
            i++;
            if (ip2 == 'A')
                ip1 = ip1 & (str.charAt (i) - '0');
        	else if (ip2 == 'B')
                ip1 = ip1 | (str.charAt (i) - '0');
        	else if(ip2 == 'C')
                ip1 = ip1 ^ (str.charAt (i) - '0');
            i++;
        }       
        return ip1;
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string -> ");
		String str = input.next();
		input.close();
		System.out.print(binaryString(str));
		
	}
}
